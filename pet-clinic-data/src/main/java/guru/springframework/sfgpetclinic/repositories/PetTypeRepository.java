package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adetola on 24/06/2019
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
