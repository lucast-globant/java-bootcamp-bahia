package topic_8.services;

import java.util.List;

import topic_8.model.Course;

public interface CourseService extends GenericService<Course> {

	public List<Course> findCoursesByTeacherId(Integer idTeacher);
}
