package data;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.Schedule;

public interface ScheduleDao extends MongoRepository<Schedule, String> {

}