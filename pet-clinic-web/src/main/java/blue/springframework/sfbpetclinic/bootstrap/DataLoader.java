package blue.springframework.sfbpetclinic.bootstrap;

import blue.springframework.sfbpetclinic.model.Owner;
import blue.springframework.sfbpetclinic.model.Vet;
import blue.springframework.sfbpetclinic.services.OwnerService;
import blue.springframework.sfbpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
    private final OwnerService ownerService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    private final VetService vetService;


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Luke");
        owner1.setLastName("Petzer");

       ownerService.save(owner1);

       Owner owner2 = new Owner();
       owner2.setFirstName("Random");
       owner2.setLastName("Person");

       ownerService.save(owner2);

       Vet vet1 = new Vet();
       vet1.setFirstName("Alice");
       vet1.setLastName("Wonderland");

       vetService.save(vet1);

       Vet vet2 = new Vet();
       vet2.setFirstName("Bob");
       vet2.setLastName("Ally");

       vetService.save(vet2);

    }
}
