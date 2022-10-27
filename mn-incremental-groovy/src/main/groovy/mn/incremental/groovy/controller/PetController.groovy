package mn.incremental.groovy.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule
import jakarta.inject.Inject
import mn.incremental.groovy.domain.Pet
import mn.incremental.groovy.service.PetService


@Controller('/pet')
class PetController {

    @Inject PetService petService

    @Post('/')
    @Secured(SecurityRule.IS_ANONYMOUS)
    HttpResponse<Pet> save() {
        // Hey 1
        def pet = petService.create('Rex')
        return HttpResponse.ok(pet)
    }

}
