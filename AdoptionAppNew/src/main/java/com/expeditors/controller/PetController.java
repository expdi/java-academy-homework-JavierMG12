package com.expeditors.controller;

import com.expeditors.domain.Adopter;
import com.expeditors.domain.Pet;
import com.expeditors.service.AdoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {
    @Autowired
    AdoptionService adoptionService;

    @PostMapping("/addPet")
    public ResponseEntity<?> addPet(@RequestBody Pet pet){
        Pet newPet = adoptionService.addPet(pet);
        URI newResource = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newPet.getIdPet())
                .toUri();
        return ResponseEntity.created(newResource).build();
    }

    @GetMapping("/getAllPets")
    public ResponseEntity<?> getAllPets(){
        List<Pet> petList = adoptionService.getAllPets();
        return ResponseEntity.ok(petList);
    }

    @GetMapping("/getPetById/{id}")
    public ResponseEntity<?> findByIdPet(@PathVariable("id") int id){
        Pet pet = adoptionService.getAllByIdPet(id);
        if(pet == null){
            return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("No Pet with id: "+ id);
        }
        return ResponseEntity.ok(pet);
    }
}
