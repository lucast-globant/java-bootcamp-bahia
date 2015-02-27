package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class HighschoolService {
	protected Connection conexionBD = null;

	public HighschoolService(){

	}


	private void connect()
	{
		if (this.conexionBD == null)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			}
			catch (Exception ex)
			{
				System.out.println(ex.getMessage());
			}

			try
			{
				String servidor = "localhost:3306";
				String baseDatos = "highschool";
				String usuario = "root";
				String clave = "";
				String uriConexion = "jdbc:mysql://" + servidor + "/" + baseDatos;

				this.conexionBD = DriverManager.getConnection(uriConexion, usuario, clave);
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
	}

	private void desconectarBD()
	{
		if (this.conexionBD != null)
		{
			try
			{
				this.conexionBD.close();
				this.conexionBD = null;
			}
			catch (SQLException ex)
			{
				System.out.println("SQLException: " + ex.getMessage());
				System.out.println("SQLState: " + ex.getSQLState());
				System.out.println("VendorError: " + ex.getErrorCode());
			}
		}
	}

	public void showCourseData(int cid){
		try{
			connect();
			Statement stmt = this.conexionBD.createStatement();

			String sql="SELECT firstname,lastname "
					+ "FROM (person NATURAL JOIN teacher) NATURAL JOIN teacher_dictate_course"
					+ " WHERE course_id=+"+cid+" AND teacher_id=id "
					+ "ORDER BY lastname ASC;";

			// se ejecuta la sentencia y se recibe un resultset
			ResultSet rs = stmt.executeQuery(sql);

			StringBuffer resultString=new StringBuffer();
			resultString.append("Course id: "+cid+"\nTeachers: ");

			// se recorre el resulset y se actualiza la tabla en pantalla
			int i = 0;
			while (rs.next())
			{
				resultString.append(rs.getString("lastname")+", "+rs.getString("firstname")+"\n");

				i++;
			}

			resultString.append("Students: ");
			sql="SELECT firstname,lastname"
					+ " FROM (person NATURAL JOIN student NATURAL JOIN student_takes_course)"
					+ " WHERE course_id=1"
					+ " ORDER BY lastname ASC;";
			rs = stmt.executeQuery(sql);
			i=0;
			while (rs.next())
			{
				resultString.append(rs.getString("lastname")+", "+rs.getString("firstname")+"\n");

				i++;
			}
			System.out.println(resultString.toString());
			
			// se cierran los recursos utilizados para recuperar la memoria
			// utilizada
			rs.close();
			stmt.close();

			desconectarBD();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void showFinalNotes(int studentId){
		try{
			connect();
			Statement stmt = this.conexionBD.createStatement();

			String sql="SELECT course.name, final_note"
					+ " FROM student_takes_course NATURAL JOIN course "
					+ "WHERE registerNumber="+studentId+" AND course_id=course.id"
					+ " ORDER BY final_note, course.name;";

			// se ejecuta la sentencia y se recibe un resultset
			ResultSet rs = stmt.executeQuery(sql);

			StringBuffer resultString=new StringBuffer();
			resultString.append("Student:"+ studentId+"\n[Course name , Final note] \n");

			// se recorre el resulset y se actualiza la tabla en pantalla
			int i = 0;
			while (rs.next())
			{
				resultString.append(rs.getString("name")+", "+rs.getString("final_note")+"\n");

				i++;
			}
		
			System.out.println(resultString.toString());

			// se cierran los recursos utilizados para recuperar la memoria
			// utilizada
			rs.close();
			stmt.close();

			desconectarBD();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	


}
