package com.db.db.Domain.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actor")
public class Autor {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actor" , columnDefinition = "SMALLINT UNSIGNED" )
    private int id;

    @Column(name = "nombre" , columnDefinition = "varchar(45)") 
    private String name; 

    @Column(name = "apellidos" , columnDefinition = "varchar(45)")
    private String lastName; 

    @Column(name = "ultima_actualizacion" , columnDefinition = "TIMESTAMP")
    private LocalDateTime lastUpdate;

    public Autor() {
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
}
