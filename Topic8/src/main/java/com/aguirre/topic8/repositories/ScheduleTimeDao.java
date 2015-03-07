package com.aguirre.topic8.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import com.aguirre.topic8.models.ScheduleTime;

@Component
public interface ScheduleTimeDao extends MongoRepository<ScheduleTime, Long> {

}
