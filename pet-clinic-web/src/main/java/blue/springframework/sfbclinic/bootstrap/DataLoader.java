package blue.springframework.sfbclinic.bootstrap;

import blue.springframework.sfbpetclinic.model.Owner;
import blue.springframework.sfbpetclinic.model.Vet;
import blue.springframework.sfbpetclinic.services.OwnerService;
import blue.springframework.sfbpetclinic.services.VetService;
import blue.springframework.sfbpetclinic.services.map.OwnerServiceMap;
import blue.springframework.sfbpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader()
    {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Luke");
        owner1.setLastName("Petzer");

       ownerService.save(owner1);

       Owner owner2 = new Owner();
       owner2.setId(2L);
       owner2.setFirstName("Azra");
       owner2.setLastName("Parker");

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
