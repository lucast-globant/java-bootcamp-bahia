package topic_8.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import topic_8.model.Teacher;

public interface TeacherRepository extends MongoRepository<Teacher, Integer> {

}
