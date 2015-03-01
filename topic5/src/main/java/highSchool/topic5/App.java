package highSchool.topic5;

/*
 * Usage:
 * 
 * App courses (-info|-perc) (-name <course_name>|-id <course_ID>)
 * 		The option "courses" gives information about courses. 
 * 		--- The option -info gives information about the assigned teachers and students who took the given course.
 * 		--- The option -perc gives information about percentage of students who passed/failed the given course. 
 * 			It assumes a student passes a course when their final note is equal or greater than 7.
 * 		
 * App teachers (-name <teacher_name>|-id <teacher_ID>)
 * 		The option "teachers" gives information about the schedule of a given teacher.
 * 
 * App students -id <registration_number>
 * 		The option "students" gives information about the final notes of each course a given student took.
 *
 */
public class App {
	public static void main(String[] args) {
		MySQLConnection dao = new MySQLConnection();
		int option = 0;
		if (args.length < 2) {
			System.out.println("Please insert parameters");
			return;
		} else {
			if (args[0].equals("courses")) {
				option = 1;
			} else {
				if (args[0].equals("students")) {
					option = 2;
				} else {
					if (args[0].equals("teachers")) {
						option = 3;
					} else {
						System.out
								.println("Please insert correct parameters. Begin with: courses|students|teachers");
						dao.closeConnection();
						return;
					}
				}
			}
		}
		try {
			boolean correct;
			switch (option) {
			case 1: // courses
				Course infoCourse = new Course(dao.getConnection());
				correct = true;
				if (args.length != 4) {
					correct = false;
				} else {
					if (args[1].equals("-info")) {
						if (args[2].equals("-name")) {
							infoCourse.infoForCourse(args[3]);
						} else {
							if (args[2].equals("-id")) {
								infoCourse.infoForCourse(Integer
										.parseInt(args[3]));
							} else {
								correct = false;
							}
						}
					} else {
						if (args[1].equals("-perc")) {
							if (args[2].equals("-name")) {
								infoCourse.percentagePassFail(args[3]);
							} else {
								if (args[2].equals("-id")) {
									infoCourse.percentagePassFail(Integer
											.parseInt(args[3]));
								} else {
									correct = false;
								}
							}
						} else {
							correct = false;
						}
					}
				}
				if (!correct) {
					System.out
							.println("Please insert correct parameters: App courses (-info|-perc) (-name <course_name>|-id <course_ID>)");
				}
				break;
			case 2: // students
				Student infoStudent = new Student(dao.getConnection());
				infoStudent.finalNotesCourses(Integer.parseInt(args[1]));
				break;
			case 3: // teachers
				correct = true;
				Teacher infoTeacher = new Teacher(dao.getConnection());
				if (args.length != 3) {
					correct = false;
				} else {
					if (args[1].equals("-name")) {
						infoTeacher.infoSchedule(args[2]);
					} else {
						if (args[1].equals("-id")) {
							infoTeacher.infoSchedule(Integer.parseInt(args[2]));
						} else {
							correct = false;
						}
					}
				}
				if (!correct) {
					System.out
							.println("Please insert correct parameters: App teachers (-name <course_name>|-id <course_ID>)");
				}
				break;
			default:
				System.out
						.println("Please insert correct parameters. Begin with: courses|students|teachers");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dao.closeConnection();
		}
	}
}
