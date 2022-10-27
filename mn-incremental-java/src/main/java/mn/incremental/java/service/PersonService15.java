package mn.incremental.java.service;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import mn.incremental.java.domain.Person;
import mn.incremental.java.service.repository.PersonRepository;

import javax.transaction.Transactional;

/**
 * Copied class just for the sake of increasing the number of elements to compile
 */
@Singleton
public class PersonService15 {

    @Inject
    private PersonRepository personRepository;

    @Transactional
    public Person create(String name) {
        Person person = new Person();
        person.setName(name);

        return personRepository.save(person);
    }

}
