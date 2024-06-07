package com.expeditors.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;


@Entity
@Table(name="pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pet")
    private int idPet;
    @Column(name="name_pet")
    private String namePet;
    @Column(name="type_pet")
    private String typePet;
    @Column(name="breed_pet")
    private String breedPet;

    @ManyToOne
    @JoinColumn(name="id_adopter", nullable=false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Adopter adopter;

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Pet(){}

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

    public String getTypePet() {
        return typePet;
    }

    public void setTypePet(String typePet) {
        this.typePet = typePet;
    }

    public String getBreedPet() {
        return breedPet;
    }

    public void setBreedPet(String breedPet) {
        this.breedPet = breedPet;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "idPet=" + idPet +
                ", namePet='" + namePet + '\'' +
                ", typePet='" + typePet + '\'' +
                ", breedPet='" + breedPet + '\'' +
                ", adopter=" + adopter +
                '}';
    }
}
