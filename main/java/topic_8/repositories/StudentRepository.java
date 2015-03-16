package topic_8.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import topic_8.entities.Student;


public interface StudentRepository extends MongoRepository<Student, Integer> {

}
