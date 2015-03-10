package topic8.highSchool;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		HighSchoolInfoService service = new HighSchoolInfoService(
				new MongoDBConnection("localhost", 27017, "HighSchool"));
		List<String> result = new ArrayList<String>();

		if (args.length == 3) {
			if (args[0].equals("-t")) {
				if (args[1].equals("-n")) {
					service.coursesForTeacher("Gapinski");
				} else {
					if (args[1].equals("-i")) {
						service.coursesForTeacher(Integer.valueOf(args[2]));
					}
				}
			} else {
				if (args[0].equals("-s")) {
					if (args[1].equals("-n")) {
						result = service.studentsWithNotesHigherThan4(args[2]);
					} else {
						if (args[1].equals("-i")) {
							result = service.studentsWithNotesHigherThan4(Integer.valueOf(args[2]));
						}
					}
				}
			}
			for (String object : result) {
				System.out.println(object);
			}
		}
	}
}
