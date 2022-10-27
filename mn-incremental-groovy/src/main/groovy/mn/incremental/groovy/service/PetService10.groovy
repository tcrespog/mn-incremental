package mn.incremental.groovy.service

import javax.transaction.Transactional

import jakarta.inject.Inject
import jakarta.inject.Singleton
import mn.incremental.groovy.domain.Pet
import mn.incremental.groovy.service.repository.PetRepository

/**
 * Class copied just for the sake of increasing the number of element to compile
 */
@Singleton
class PetService10 {

    @Inject PetRepository petRepository

    @Transactional
    Pet create(String name) {
        def pet = new Pet(name: name)
        return petRepository.save(pet)
    }

}
