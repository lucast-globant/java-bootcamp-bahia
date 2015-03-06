package model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;


@Transactional
public interface TeacherDictateCourseDao extends CrudRepository<TeacherDictateCourse, Long>{
	
	public TeacherDictateCourse findByTeacherId(Long id);

}
