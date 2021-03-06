package blue.springframework.sfbpetclinic.respositories;

import blue.springframework.sfbpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Long>
{

}
