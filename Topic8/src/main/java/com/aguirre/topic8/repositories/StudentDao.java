package com.aguirre.topic8.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import com.aguirre.topic8.models.Student;

@Component
public interface StudentDao extends MongoRepository<Student, Long> {

}
