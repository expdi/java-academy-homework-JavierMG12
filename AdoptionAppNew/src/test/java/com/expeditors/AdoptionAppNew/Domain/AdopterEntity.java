package com.expeditors.AdoptionAppNew.Domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "adopter", schema = "public", catalog = "newadoptapp")
public class AdopterEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_adopter")
    private int idAdopter;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "phone_adopter")
    private String phoneAdopter;

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

    public String getPhoneAdopter() {
        return phoneAdopter;
    }

    public void setPhoneAdopter(String phoneAdopter) {
        this.phoneAdopter = phoneAdopter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdopterEntity that = (AdopterEntity) o;
        return idAdopter == that.idAdopter && Objects.equals(name, that.name) && Objects.equals(phoneAdopter, that.phoneAdopter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdopter, name, phoneAdopter);
    }
}
