package blue.springframework.sfbpetclinic.bootstrap;

import blue.springframework.sfbpetclinic.model.*;
import blue.springframework.sfbpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner
{
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }




    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if (count == 0)
        {
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty saveRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty saveSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty saveDentistry = specialtyService.save(dentistry);

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

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Alice");
        vet1.setLastName("Wonderland");
        vet1.getSpecialties().add(saveRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Bob");
        vet2.setLastName("Ally");
        vet2.getSpecialties().add(saveSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets");

        Visit catVisit = new Visit();
        catVisit.setPet(lukesPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Foodens!");

        visitService.save(catVisit);

        System.out.println("Loaded Visits");

    }
}
