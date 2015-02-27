package topic_5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		MySQL mySQLAccess = new MySQL();

		Scanner scanner = new Scanner(System.in);

		int id_course;
		System.out.print("List students and teachers for a course, insert an id course (Valid id course: 1 to 5): ");
		id_course = scanner.nextInt();
		while (id_course<1 || id_course>5) {
			System.out.print("The id course is invalid, try again (Valid id course: 1 to 5): ");
			id_course = scanner.nextInt();
		}
		mySQLAccess.list_Course_Teachers_Students(id_course);

		int reg_number;
		System.out.print("List final course notes for a student, insert a registration number (valid 1 to 35):");
		reg_number = scanner.nextInt();
		while (reg_number<1 || reg_number>35) {
			System.out.print("The registration number is invalid, try again (Valid 1 to 5): ");
			reg_number = scanner.nextInt();
		}
		mySQLAccess.list_FinalNotes_Course(reg_number);
		mySQLAccess.close();
	} 
}