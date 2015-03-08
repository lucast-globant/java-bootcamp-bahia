package models;

import javax.transaction.Transactional;

@Transactional
public interface StudentDao extends MongoRepository<Student, String> {

}
