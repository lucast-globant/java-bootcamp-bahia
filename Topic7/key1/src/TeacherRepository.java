
package orm;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
	List<Teacher> findByLastName(String lastName);
}
