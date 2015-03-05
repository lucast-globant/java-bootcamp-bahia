package models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ScheduleDao extends CrudRepository<Schedule, Long> {

	public Schedule findByName(String name);

}