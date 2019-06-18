package services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by Adetola on 18/06/2019
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
