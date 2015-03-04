package rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

interface MeetingRepository extends JpaRepository<Meeting,Long> {
	
	public void delete (Meeting deleted);
	public List<Meeting> findAll();
	public Meeting save (Meeting saved);
	public Meeting findOne (Long id);
	
}