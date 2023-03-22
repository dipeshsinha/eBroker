package com.ebroker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class PropertyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    private String address;
    private int rent;
    private int ownerID;
    private String furnished;
    private int bhk;
    private int floor;
    private int renterID;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getRent() {
        return rent;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }
    public int getOwnerID() {
        return ownerID;
    }
    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }
    public String getFurnished() {
        return furnished;
    }
    public void setFurnished(String furnished) {
        this.furnished = furnished;
    }
    public int getBhk() {
        return bhk;
    }
    public void setBhk(int bhk) {
        this.bhk = bhk;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public int getRenterID() {
        return renterID;
    }
    public void setRenterID(int renterID) {
        this.renterID = renterID;
    }
}
