package topic_7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import topic_7.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
