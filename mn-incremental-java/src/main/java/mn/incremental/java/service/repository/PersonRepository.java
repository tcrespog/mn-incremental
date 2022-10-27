package mn.incremental.java.service.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import mn.incremental.java.domain.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
