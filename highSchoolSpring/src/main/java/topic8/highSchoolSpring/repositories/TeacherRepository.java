package topic8.highSchoolSpring.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import topic8.highSchoolSpring.model.Teacher;

public interface TeacherRepository extends MongoRepository<Teacher, Long> {
	public Teacher findByLastName(String lastName);

	public Teacher findByFirstName(String firstName);
}
