
package orm;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {

    //List<Customer> findByLastName(String lastName);
}