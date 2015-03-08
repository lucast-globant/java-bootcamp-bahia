package data;

import javax.transaction.Transactional;

import models.Student;

@Transactional
public interface StudentDao extends MongoRepository<Student, String> {

}
