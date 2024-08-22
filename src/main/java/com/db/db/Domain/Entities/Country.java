package com.db.db.Domain.Entities;

import java.time.LocalDateTime;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "pais")
public class Country {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais" , columnDefinition = "SMALLINT UNSIGNED" )
    private int id; 

    @NotNull(message = "Name cannot be null")
    @Column(name = "nombre" , columnDefinition = "VARCHAR(50)")
    private String name; 

    @Column(name = "ultima_actualizacion" , columnDefinition = "TIMESTAMP")
    private LocalDateTime lastUpdate;

    public Country() {
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

    
    


}
