package model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface TeacherDao extends CrudRepository<Teacher, Long> {

	public Teacher findByFirstnameAndLastname(String name, String lastname);
	
}
