package blue.springframework.sfbpetclinic.services;

import blue.springframework.sfbpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
