package models;

import javax.transaction.Transactional;

@Transactional
public interface TeacherDao extends MongoRepository<Teacher, Long> {

}
