package logic;

public class Main {

	public static void main(String[] args) throws Exception {
		MySQLAccess dao = new MySQLAccess();
		dao.startDataBase();

		/*
		 * dao.addTeacher("a", "a", new java.sql.Date(1990, 12, 5));
		 * dao.addTeacher("b", "b", new java.sql.Date(1990, 12, 5));
		 * dao.addTeacher("c", "c", new java.sql.Date(1990, 12, 5));
		 */

		/*
		 * dao.createSheduleTime("Monday", 14, 18);
		 * dao.createSheduleTime("Thuesday", 14, 18);
		 * dao.createSheduleTime("Friday", 14, 18);
		 */

		/*
		 * dao.addCourse("Math", "a", "a", 4, "Monday", 14, 18);
		 * dao.addCourse("English", "b", "b", 4, "Friday", 14, 18);
		 * dao.addCourse("Python", "c", "c", 4, "Thuesday", 14, 18);
		 * dao.addCourse("Data Bases", "c", "c", 4, "Monday", 14, 18);
		 * dao.addCourse("Phisics", "a", "a", 4, "Monday", 14, 18);
		 */
/*
		dao.addStudent("Juan", "Perez", 1, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Federico", "Diaz", 2, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Roman", "Riquelme", 3, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Daniel", "Osvaldo", 4, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Walter", "Lodeiro", 5, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Me", "Estoy", 6, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Cansando", "De", 7, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Poner", "Nombres", 8, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Pero", "Casi", 9, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Llego", "A", 10, new java.sql.Date(1995, 10, 6));
		dao.addStudent("La", "Mitad", 11, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Listo", "LLegue", 12, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Y", "La", 13, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Pase", "Asd", 14, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Ricardo", "Iorio", 15, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Manuel", "Napoli", 16, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Joaquin", "Garcia", 17, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Leonel", "Messi", 18, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Agustin", "Orion", 19, new java.sql.Date(1995, 10, 6));
		dao.addStudent("Termi", "Ne", 20, new java.sql.Date(1995, 10, 6));*/

		/*dao.addStudentToCourse("Juan", "Perez", "Math");
		dao.addStudentToCourse("Juan", "Perez", "English");
		dao.addStudentToCourse("Juan", "Perez", "Python");
		dao.addStudentToCourse("Juan", "Perez", "Data Bases");
		dao.addStudentToCourse("Juan", "Perez", "Phisics");
		dao.addStudentToCourse("Leonel", "Messi", "Math");
		dao.addStudentToCourse("Leonel", "Messi", "English");
		dao.addStudentToCourse("Leonel", "Messi", "Python");
		dao.addStudentToCourse("Leonel", "Messi", "Data Bases");
		dao.addStudentToCourse("Leonel", "Messi", "Phisics");

		dao.addTeacherToCourse("a", "a", "Math");
		dao.addTeacherToCourse("a", "a", "Python");
		dao.addTeacherToCourse("b", "b", "Phisics");
		dao.addTeacherToCourse("b", "b", "Data Bases");
		dao.addTeacherToCourse("c", "c", "English");

		dao.addNotes("Leonel", "Messi", "Math", 10, 10, 10, 10);
		dao.addNotes("Leonel", "Messi", "English", 10, 10, 10, 10);
		dao.addNotes("Leonel", "Messi", "Phisics", 10, 10, 10, 10);*/
		
		
		System.out.println(dao.listStudentsAndTeachers("English"));
		System.out.println(dao.listFinalNotes(18));
		dao.bdClose();
	}

}
