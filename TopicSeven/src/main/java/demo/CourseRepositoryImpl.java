package demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Course> getCoursesOfStudent(String studentName,
			String studentLastName) {
		return this.entityManager
				.createQuery(
						"select c.name from course c, student s, student_course sc where c.id_course = sc.id_course_fk AND s.id_student = sc.id_student_fk AND s.first_name = '"
								+ studentName
								+ "' AND s.last_name = '"
								+ studentLastName + "'").getResultList();
	}

}
