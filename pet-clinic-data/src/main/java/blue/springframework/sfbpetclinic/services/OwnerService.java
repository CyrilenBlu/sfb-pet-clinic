package blue.springframework.sfbpetclinic.services;

import blue.springframework.sfbpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastName(String lastName);
}
