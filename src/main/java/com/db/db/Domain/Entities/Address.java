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
@Table(name = "direccion")
public class Address {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion" , columnDefinition = "SMALLINT UNSIGNED" )
    private int id; 

    @Column(name = "direccion" , columnDefinition = "VARCHAR(50)") 
    private String address; 


    @Column(name = "direccion2" , columnDefinition = "VARCHAR(50)")
    private String address2; 

    @Column(name = "distrito" , columnDefinition = "VARCHAR(50)")
    private String distrit;

    @Column(name = "codigo_postal" , columnDefinition = "VARCHAR(10)")
    private String postCode;

    @Column(name = "telefono" , columnDefinition = "VARCHAR(20)")
    private String telephone;

    @Column(name = "ultima_actualizacion" , columnDefinition = "TIMESTAMP")
    private LocalDateTime lastUpdate;

    @ManyToOne 
    @JoinColumn(name = "id_ciudad") 
    private City city;

    public Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrit() {
        return distrit;
    }

    public void setDistrit(String distrit) {
        this.distrit = distrit;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    


}
