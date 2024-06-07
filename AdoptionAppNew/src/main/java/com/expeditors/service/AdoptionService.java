package com.expeditors.service;

import com.expeditors.domain.Adopter;
import com.expeditors.domain.Pet;
import com.expeditors.repository.AdopterRepository;
import com.expeditors.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdoptionService {
    @Autowired
    AdopterRepository adopterRepository;

    @Autowired
    PetRepository petRepository;

    public Adopter addAdopter(Adopter adopter){
        return this.adopterRepository.save(adopter);
    }
    public List<Adopter> getAllAdopters(){
        return this.adopterRepository.findAll();
    }
    public Adopter getAllByIdAdopter(int id){
        return this.adopterRepository.getAllByIdAdopter(id);
    }



    public Pet addPet(Pet pet){
        return this.petRepository.save(pet);
    }
    public List<Pet> getAllPets(){
        return this.petRepository.findAll();
    }
    public Pet getAllByIdPet(int id){
        return this.petRepository.getAllByIdPet(id);
    }

}
