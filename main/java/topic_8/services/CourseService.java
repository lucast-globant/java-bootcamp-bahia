package topic_8.services;


import java.util.List;

import org.springframework.stereotype.Component;

import topic_8.entities.Course;
@Component
public interface CourseService {
	public Course create(Course t);

	public Course read(Integer id);

	public Course update(Course t);

	public void delete(Integer id);

	public List<Course> findAll();
	
	public List<Course> findCoursesByTeacherId(Integer id);


	

}
