package blue.springframework.sfbpetclinic.respositories;

import blue.springframework.sfbpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long>
{

}
