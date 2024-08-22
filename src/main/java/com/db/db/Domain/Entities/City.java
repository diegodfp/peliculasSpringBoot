package com.db.db.Domain.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudad")
public class City {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad" , columnDefinition = "SMALLINT UNSIGNED" )
    private int id; 

    @Column(name = "nombre" , columnDefinition = "VARCHAR(50)")
    private String name;

    @Column(name = "ultima_actualizacion" , columnDefinition = "TIMESTAMP")
    private LocalDateTime lastUpdate;

    @ManyToOne 
    @JoinColumn(name = "id_pais") 
    private Country countries;

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Country getCountries() {
        return countries;
    }

    public void setCountries(Country countries) {
        this.countries = countries;
    }

    

}
