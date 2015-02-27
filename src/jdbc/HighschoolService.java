package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class HighschoolService {
	protected Connection connectionDB = null;

	public HighschoolService(){

	}


	/**
	 * connect to database
	 */
	private void connect()
	{
		if (this.connectionDB == null)
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
				String server = "localhost:3306";
				String dataBase = "highschool";
				String user = "root";
				String password = "";
				String uriConnection = "jdbc:mysql://" + server + "/" + dataBase;

				this.connectionDB = DriverManager.getConnection(uriConnection, user, password);
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
	}

	/**
	 * disconnect from database
	 */
	private void disconnect()
	{
		if (this.connectionDB != null)
		{
			try
			{
				this.connectionDB.close();
				this.connectionDB = null;
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
			Statement stmt = this.connectionDB.createStatement();

			String sql="SELECT firstname,lastname "
					+ "FROM (person NATURAL JOIN teacher) NATURAL JOIN teacher_dictate_course"
					+ " WHERE course_id=+"+cid+" AND teacher_id=id "
					+ "ORDER BY lastname ASC;";

			ResultSet rs = stmt.executeQuery(sql);

			StringBuffer resultString=new StringBuffer();
			resultString.append("Course id: "+cid+"\nTeachers: ");

			// show the results from the resultset
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
			
			// close the open resourses to free memory
			rs.close();
			stmt.close();

			disconnect();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void showFinalNotes(int studentId){
		try{
			connect();
			Statement stmt = this.connectionDB.createStatement();

			String sql="SELECT course.name, final_note"
					+ " FROM student_takes_course NATURAL JOIN course "
					+ "WHERE registerNumber="+studentId+" AND course_id=course.id"
					+ " ORDER BY final_note, course.name;";


			ResultSet rs = stmt.executeQuery(sql);

			StringBuffer resultString=new StringBuffer();
			resultString.append("Student:"+ studentId+"\n[Course name , Final note] \n");

			// show to console the results from the resultSet
			int i = 0;
			while (rs.next())
			{
				resultString.append(rs.getString("name")+", "+rs.getString("final_note")+"\n");

				i++;
			}
		
			System.out.println(resultString.toString());

			// close open resourses to free memory
			rs.close();
			stmt.close();

			disconnect();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	


}
