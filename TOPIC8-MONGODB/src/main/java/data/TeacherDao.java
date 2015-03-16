package data;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.Teacher;

public interface TeacherDao extends MongoRepository<Teacher, Long> {

}
