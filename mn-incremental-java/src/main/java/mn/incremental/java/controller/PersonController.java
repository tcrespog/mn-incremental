package mn.incremental.java.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import jakarta.inject.Inject;
import mn.incremental.java.domain.Person;
import mn.incremental.java.service.PersonService;


@Controller("/person")
public class PersonController {

    @Inject
    private PersonService personService;

    @Post("/")
    @Secured(SecurityRule.IS_ANONYMOUS)
    public HttpResponse<Person> save() {
        // You can just change this comment to trigger re-compilation 7
        Person person = personService.create("James");
        return HttpResponse.ok(person);
    }

}
