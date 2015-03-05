package models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface TeacherDao extends CrudRepository<Teacher, Long> {

	public Student findByNameAndLastName(String name, String lastname);

}
