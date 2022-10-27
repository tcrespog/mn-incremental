package mn.incremental.java.service;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import mn.incremental.java.domain.Person;
import mn.incremental.java.service.repository.PersonRepository;

import javax.transaction.Transactional;

@Singleton
public class PersonService {

    @Inject
    private PersonRepository personRepository;

    @Transactional
    public Person create(String name) {
        Person person = new Person();
        person.setName(name);

        return personRepository.save(person);
    }

}
