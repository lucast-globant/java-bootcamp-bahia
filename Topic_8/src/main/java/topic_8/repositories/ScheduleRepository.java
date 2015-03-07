package topic_8.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import topic_8.model.Schedule;

public interface ScheduleRepository extends MongoRepository<Schedule, Integer> {

}
