package mn.incremental.groovy.service.repository

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import mn.incremental.groovy.domain.Pet

@Repository
interface PetRepository extends CrudRepository<Pet, Long> {
}
