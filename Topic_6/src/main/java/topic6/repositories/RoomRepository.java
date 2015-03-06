package topic6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import topic6.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
