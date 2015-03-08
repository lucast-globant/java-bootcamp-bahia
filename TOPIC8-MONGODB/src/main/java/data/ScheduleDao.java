package data;

import javax.transaction.Transactional;

import models.Schedule;

@Transactional
public interface ScheduleDao extends MongoRepository<Schedule, String> {

}