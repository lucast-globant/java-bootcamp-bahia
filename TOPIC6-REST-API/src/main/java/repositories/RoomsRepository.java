package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import classes.Attendee;
import classes.Room;

public interface RoomsRepository extends JpaRepository<Room, Long> {

	public List<Room> findAll();
}