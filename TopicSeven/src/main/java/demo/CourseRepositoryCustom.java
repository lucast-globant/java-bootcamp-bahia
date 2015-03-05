package demo;

import java.util.List;

public interface CourseRepositoryCustom {

	public List<Course> getCoursesOfStudent(String studentName,
			String studentLastName);
}
