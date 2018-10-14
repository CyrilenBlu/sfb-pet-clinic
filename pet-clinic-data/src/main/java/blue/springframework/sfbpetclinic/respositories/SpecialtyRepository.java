package blue.springframework.sfbpetclinic.respositories;

import blue.springframework.sfbpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepository extends CrudRepository<Specialty, Long>
{

}
