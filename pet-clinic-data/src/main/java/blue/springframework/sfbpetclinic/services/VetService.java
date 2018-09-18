package blue.springframework.sfbpetclinic.services;

import blue.springframework.sfbpetclinic.model.Vet;

import java.util.Set;

public interface VetService
{
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
