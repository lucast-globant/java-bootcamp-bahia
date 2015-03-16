package topic_8.implementations;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topic_8.repositories.CourseRepository;
import topic_8.services.CourseService;
import topic_8.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courses;

	@Override
	public Course create(Course t) {
		return courses.save(t);
	}

	@Override
	public Course read(Integer id) {
		return courses.findOne(id);
	}

	@Override
	public Course update(Course t) {
		return courses.save(t);
	}

	@Override
	public void delete(Integer id) {
		courses.delete(id);
	}

	@Override
	public List<Course> findAll() {
		return courses.findAll();
	}

	@Override
	public List<Course> findCoursesByTeacherId(Integer idTeacher) {
		List<Course> toReturn = courses.findCoursesByTeacherId(idTeacher);
		Collections.sort(toReturn, new Comparator<Course>() {
			@Override
			public int compare(Course c1, Course c2) {
				return new Integer(c1.getName().compareTo(c2.getName()));
			}
		});
		return toReturn;
	}
}

