package blue.springframework.sfbpetclinic.bootstrap;

import blue.springframework.sfbpetclinic.model.Owner;
import blue.springframework.sfbpetclinic.model.Pet;
import blue.springframework.sfbpetclinic.model.PetType;
import blue.springframework.sfbpetclinic.model.Vet;
import blue.springframework.sfbpetclinic.services.OwnerService;
import blue.springframework.sfbpetclinic.services.PetTypeService;
import blue.springframework.sfbpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner
{
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }




    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Luke");
        owner1.setLastName("Petzer");
        owner1.setAddress("92 Klipfontein");
        owner1.setCity("Cape Town");
        owner1.setTelephone("1234567891");

        Pet lukesPet = new Pet();
        lukesPet.setPetType(saveDogPetType);
        lukesPet.setOwner(owner1);
        lukesPet.setName("Tedd");
        lukesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(lukesPet);

       ownerService.save(owner1);

       Owner owner2 = new Owner();
       owner2.setFirstName("Random");
       owner2.setLastName("Person");
       owner2.setAddress("123 Something");
       owner2.setCity("Cape Town");
       owner2.setTelephone("1234567892");

       Pet randomPet = new Pet();
       randomPet.setName("catty");
       randomPet.setOwner(owner2);
       randomPet.setBirthDate(LocalDate.now());
       randomPet.setPetType(saveCatPetType);
       owner2.getPets().add(randomPet);

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
