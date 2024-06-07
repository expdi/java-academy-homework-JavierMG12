package com.expeditors.controller;

import com.expeditors.domain.Adopter;
import com.expeditors.service.AdoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/adopter")
public class AdopterController {
    @Autowired
    AdoptionService adoptionService;

    @GetMapping("/getAllAdopters")
    public ResponseEntity<?> getAllAdopters(){
        List<Adopter> adopterList = adoptionService.getAllAdopters();
        return ResponseEntity.ok(adopterList);
    }

    @PostMapping("/addAdopter")
    public ResponseEntity<?> addAdopter(@RequestBody Adopter adopter){
        Adopter newAdopter = adoptionService.addAdopter(adopter);
        URI newResource = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newAdopter.getIdAdopter())
                .toUri();
        return ResponseEntity.created(newResource).build();
    }
    @GetMapping("/getAdopterById/{id}")
    public ResponseEntity<?> findByIdAdopter(@PathVariable("id") int id){
        Adopter adopter = adoptionService.getAllByIdAdopter(id);
        if(adopter == null){
            return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("No Adoption with id: "+ id);
        }
        return ResponseEntity.ok(adopter);
    }
}
