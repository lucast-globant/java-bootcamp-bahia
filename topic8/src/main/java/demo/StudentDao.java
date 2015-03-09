package demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentDao  extends MongoRepository<Student, String>{

}
