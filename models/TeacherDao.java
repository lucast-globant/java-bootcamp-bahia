package models;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface TeacherDao extends JpaRepository<Teacher, Long> {

	//public Student findByLastnameAndFirstname(String lastName, String firstName);
	
}
