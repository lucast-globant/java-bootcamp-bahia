package model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface StudentDao extends CrudRepository<Student, Long> {

	public List<Student> findAllByFirstname(String name);

}