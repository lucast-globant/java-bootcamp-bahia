
package orm;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

    //List<Customer> findByLastName(String lastName);
}
