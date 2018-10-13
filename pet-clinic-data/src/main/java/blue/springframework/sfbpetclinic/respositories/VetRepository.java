package blue.springframework.sfbpetclinic.respositories;

import blue.springframework.sfbpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long>
{

}
