package data;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.Student;

public interface StudentDao extends MongoRepository<Student, Long> {

}
