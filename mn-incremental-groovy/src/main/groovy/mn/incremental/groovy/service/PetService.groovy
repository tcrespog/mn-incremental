package mn.incremental.groovy.service

import jakarta.inject.Inject
import jakarta.inject.Singleton
import mn.incremental.groovy.domain.Pet
import mn.incremental.groovy.service.repository.PetRepository

import javax.transaction.Transactional

@Singleton
class PetService {

    @Inject PetRepository petRepository

    @Transactional
    Pet create(String name) {
        def pet = new Pet(name: name)
        return petRepository.save(pet)
    }

}
