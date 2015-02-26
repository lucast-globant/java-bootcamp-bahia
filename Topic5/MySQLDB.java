import java.sql.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class MySQLDB {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public MySQLDB connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dataBase = "jdbc:mysql://localhost/high_school?user=root&password=martinA1987";
            setConnection(DriverManager.getConnection(dataBase));
            if (connection != null) {
                System.out.println("Successful conexion!");
            } else {
                System.out.println("Failed connexion!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }

    public ResultSet query(String sql) {
        ResultSet result;
        try {
            Statement statement = getConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            result = statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return result;
    }

    public boolean execute(String sql) {
        try {
            Statement statement = getConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            statement.executeUpdate(sql);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException { 
    	MySQLDB dataBase = new MySQLDB().connect();
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter course id (Example: 1,2,3,4,5):");
		String s = br.readLine();
        
        ResultSet result = dataBase.query("select name,first_name,last_name from course,teacher where id_course=+"+s+" AND course.assigned_teacher=teacher.id;");
        if (result != null) {
            try {
            	result.next();
            	System.out.println("");
                System.out.println("Course: "+result.getString(1));
                System.out.println("Teacher: "+result.getString(3)+" "+result.getString(2));
                System.out.println("Estudents:");
                result = dataBase.query("select course,last_name,first_name from student_course, student where course="+s+" AND student_course.student=student.registration_number ORDER BY last_name;");
                while (result.next()) {
                    System.out.println(result.getString(2)+", "+result.getString(3));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Enter registration number of an estudent (Example: 1,2,3,4,..,195):");
		s = br.readLine();
		result = dataBase.query("select first_name, last_name from student where registration_number="+s+";");
        if (result != null) {
            try {
            	result.next();
            	System.out.println("");
                System.out.println("Name: "+result.getString(1)+" "+result.getString(2));
                
                result = dataBase.query("select final_exam,name from student_course_calification,course where student=1 and student_course_calification.course=course.id_course order by final_exam DESC,course;");
                while (result.next()) {
                    System.out.println(result.getString(2)+", "+result.getString(1));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Enter a course id (Example: 1,2,3,4,5):");
		s = br.readLine();
		result = dataBase.query("select  COUNT(*) from student_course_calification where course="+s+" AND final_exam>=60;");
        if (result != null) {
            try {
            	result.next();
            	
            	int num=Integer.parseInt(result.getString(1));
            	result = dataBase.query("select  COUNT(*) from student_course_calification where course=1;");
            	result.next();
            	int den=Integer.parseInt(result.getString(1));
                System.out.println((((double)num)/den )*100+"% passed");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Enter the teacher id (Example: 1,2,3):");
		s = br.readLine();
		result = dataBase.query("select last_name, first_name from teacher where id="+s+";");
        if (result != null) {
            try {
            	result.next();
            	System.out.println("");
                System.out.println("Teacher: "+result.getString(1)+" "+result.getString(2));
                
                result = dataBase.query("select date_of_assignment, name from course where assigned_teacher="+s+";");
                while (result.next()) {
                    System.out.println(result.getString(1)+", "+result.getString(2));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
