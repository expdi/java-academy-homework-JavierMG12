package com.expeditors.repository;

import com.expeditors.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet,Integer> {
    Pet getAllByIdPet (int idPet);
}
