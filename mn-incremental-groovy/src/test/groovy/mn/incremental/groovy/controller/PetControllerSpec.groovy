package mn.incremental.groovy.controller

import io.micronaut.http.HttpMethod
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import mn.incremental.groovy.domain.Pet
import spock.lang.Specification

@MicronautTest(startApplication = true, transactional = false)
class PetControllerSpec extends Specification {

    @Inject
    @Client('/')
    HttpClient client

    void 'create a pet'() {
        when:
        def req = HttpRequest.create(HttpMethod.POST, '/pet')
        def res = client.toBlocking().exchange(req, Pet)

        then:
        res.body().name == 'Rex'
    }

}
