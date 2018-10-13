package blue.springframework.sfbpetclinic.respositories;

import blue.springframework.sfbpetclinic.model.Owner;
import blue.springframework.sfbpetclinic.services.CrudService;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudService<Owner, Long>
{

    Owner findByLastName(String lastName);
}
