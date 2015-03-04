package rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

interface RoomRepository extends JpaRepository<Room,Long>{
	public List<Room> findByName (String name);
}
