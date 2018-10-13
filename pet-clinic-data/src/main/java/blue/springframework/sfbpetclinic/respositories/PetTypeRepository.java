package blue.springframework.sfbpetclinic.respositories;

import blue.springframework.sfbpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long>
{

}
