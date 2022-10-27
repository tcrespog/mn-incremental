package mn.incremental.java.controller

import io.micronaut.http.HttpMethod
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import mn.incremental.java.domain.Person
import spock.lang.Specification

@MicronautTest(startApplication = true, transactional = false)
class PersonControllerSpec extends Specification {

    @Inject
    @Client('/')
    HttpClient client

    void 'create a person'() {
        when:
        def req = HttpRequest.create(HttpMethod.POST, '/person')
        def res = client.toBlocking().exchange(req, Person)

        then:
        res.body().name == 'James'
    }

}
