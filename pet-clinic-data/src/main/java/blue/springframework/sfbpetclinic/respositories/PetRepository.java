package blue.springframework.sfbpetclinic.respositories;

import blue.springframework.sfbpetclinic.model.Pet;
import blue.springframework.sfbpetclinic.services.CrudService;

public interface PetRepository extends CrudService<Pet, Long>
{

}
