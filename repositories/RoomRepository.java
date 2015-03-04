package topic6.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import topic6.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

	public List<Room> findAll();

}
