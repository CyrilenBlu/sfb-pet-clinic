package blue.springframework.sfbpetclinic.respositories;

import blue.springframework.sfbpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long>
{

}
