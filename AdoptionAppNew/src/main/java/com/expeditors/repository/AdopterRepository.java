package com.expeditors.repository;

import com.expeditors.domain.Adopter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdopterRepository extends JpaRepository<Adopter,Integer> {

   Adopter getAllByIdAdopter (int idAdopter);

}
