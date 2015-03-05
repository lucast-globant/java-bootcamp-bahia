package demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class StudentRepositoryImpl implements StudentRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudentsOfCourse(String courseName) {
		return this.entityManager
				.createQuery(
						"select s.first_name, s.last_name from course c, student s, student_course sc where c.id_course = sc.id_course_fk AND s.id_student = sc.id_student_fk AND c.name = '"
								+ courseName + "'").getResultList();
	}
}
