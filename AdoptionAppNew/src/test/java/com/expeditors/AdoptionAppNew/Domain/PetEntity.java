package com.expeditors.AdoptionAppNew.Domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "pet", schema = "public", catalog = "newadoptapp")
public class PetEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_pet")
    private int idPet;
    @Basic
    @Column(name = "name_pet")
    private String namePet;
    @Basic
    @Column(name = "breed_pet")
    private String breedPet;
    @Basic
    @Column(name = "type_pet")
    private String typePet;
    @Basic
    @Column(name = "id_adopter")
    private Integer idAdopter;

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public String getBreedPet() {
        return breedPet;
    }

    public void setBreedPet(String breedPet) {
        this.breedPet = breedPet;
    }

    public String getTypePet() {
        return typePet;
    }

    public void setTypePet(String typePet) {
        this.typePet = typePet;
    }

    public Integer getIdAdopter() {
        return idAdopter;
    }

    public void setIdAdopter(Integer idAdopter) {
        this.idAdopter = idAdopter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetEntity petEntity = (PetEntity) o;
        return idPet == petEntity.idPet && Objects.equals(namePet, petEntity.namePet) && Objects.equals(breedPet, petEntity.breedPet) && Objects.equals(typePet, petEntity.typePet) && Objects.equals(idAdopter, petEntity.idAdopter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPet, namePet, breedPet, typePet, idAdopter);
    }
}
