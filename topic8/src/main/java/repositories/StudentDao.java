package repositories;

import model.Student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface StudentDao  extends MongoRepository<Student, String>{

}
