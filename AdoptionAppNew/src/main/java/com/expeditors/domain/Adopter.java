package com.expeditors.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="adopter")
public class Adopter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_adopter")
    private int idAdopter;
    @Column(name = "name")
    private String name;
    @Column(name = "phone_adopter")
    private String phone_adopter;
    @OneToMany(mappedBy = "adopter")
    private List<Pet> petList;

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    public Adopter(){

    }

    public int getIdAdopter() {
        return idAdopter;
    }

    public void setIdAdopter(int idAdopter) {
        this.idAdopter = idAdopter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_adopter() {
        return phone_adopter;
    }

    public void setPhone_adopter(String phone_adopter) {
        this.phone_adopter = phone_adopter;
    }


    @Override
    public String toString() {
        return "Adopter{" +
                "id_adopter=" + idAdopter +
                ", name='" + name + '\'' +
                ", phone_adopter='" + phone_adopter + '\'' +
                ", petList=" + petList +
                '}';
    }
}
