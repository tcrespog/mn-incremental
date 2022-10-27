package mn.incremental.groovy.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Pet {

    @Id
    @GeneratedValue
    Long id

    String name

}
