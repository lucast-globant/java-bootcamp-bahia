package data;

import javax.transaction.Transactional;

import models.Teacher;

@Transactional
public interface TeacherDao extends MongoRepository<Teacher, Long> {

}
