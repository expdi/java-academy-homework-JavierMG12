package com.expeditors;

import com.expeditors.domain.Adopter;
import com.expeditors.domain.Pet;
import com.expeditors.service.AdoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class AdoptionApp {
    public static void main(String[] args) {
        SpringApplication.run(AdoptionApp.class,args);
    }

//    @Component
//    class MyRunner implements CommandLineRunner{
//        @Autowired
//        private AdoptionService adoptionService;
//
//        @Override
//        public void run(String... args) throws Exception{
//            Pet pet = new Pet();
//            pet.setIdPet(0);
//            pet.setNamePet("Chicken");
//            pet.setBreedPet("Chihuahua");
//            pet.setTypePet("DOG");
//            Adopter adopter = new Adopter();
//            adopter.setIdAdopter(1);
//            pet.setAdopter(adopter);
//            Pet newPet = adoptionService.addPet(pet);
//            System.out.println(newPet);
//        }
//    }
}
