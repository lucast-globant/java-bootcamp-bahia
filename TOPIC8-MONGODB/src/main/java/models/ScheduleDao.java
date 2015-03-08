package models;

import javax.transaction.Transactional;

@Transactional
public interface ScheduleDao extends MongoRepository<Schedule, String> {

}