package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adetola on 24/06/2019
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
