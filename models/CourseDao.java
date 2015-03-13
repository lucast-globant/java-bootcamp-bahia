package models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CourseDao extends CrudRepository<Course, Long> {
	
}