package topic5;

import java.sql.SQLException;

public class DataTest {

	public static void main(String[] args) {
		
		java.sql.Connection con;
		java.sql.Statement st;
		java.sql.ResultSet resultSet;
		String sql;
		int course_id = 1,
				regNumber = 10000;		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String host = "127.0.0.1";
			String db = "highschool";
			String uriConexion = "jdbc:mysql://" + host + "/" + db;
			String user = "root";
			String pass = "1234";
			
			con = java.sql.DriverManager.getConnection(uriConexion, user, pass);
			
			st = con.createStatement();
			
			
 			resultSet = st.executeQuery("select `highschool`.`courseName`("+course_id+");");
			resultSet.next();
			System.out.println(resultSet.getString(1));
			resultSet = st.executeQuery("select `highschool`.`teacherAssigned`("+course_id+");");
			resultSet.next();
			System.out.println(resultSet.getString(1));
			System.out.println("Students: ");
			
			sql = "select concat(st_lastName,', ',st_firstName) from highschool.student join highschool.studentcourse on (st_id = sc_student and sc_course = "+course_id+")order by st_lastName";
					resultSet = st.executeQuery(sql);
					while (resultSet.next()) {
						System.out.println("    "+resultSet.getString(1));
					}
			
			System.out.println();
			System.out.println();
			
			resultSet = st.executeQuery("select concat('Student: ',st_lastName,', ',st_firstName) from Student where st_regNumber="+regNumber+";");
			resultSet.next();
			System.out.println(resultSet.getString(1));
			System.out.println();

			sql = "SELECT concat('Course: ',cs_name,' - ',sc_finalNote) FROM Student join (StudentCourse JOIN Course ON cs_id = sc_course) on sc_student = st_id and st_regNumber = "+regNumber+" ORDER BY sc_finalNote DESC, cs_name";
			resultSet = st.executeQuery(sql);
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
			
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}