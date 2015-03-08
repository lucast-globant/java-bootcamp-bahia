package demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SheduleRepository extends MongoRepository<Shedule, String> {

}
