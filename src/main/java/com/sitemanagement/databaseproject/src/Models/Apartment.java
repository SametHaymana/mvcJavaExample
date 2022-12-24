/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sitemanagement.databaseproject.src.Models;

/**
 *
 * @author tomahawk
 */
public class Apartment {
    
    private short Apartment_id;
    private int apartment_number;
    private int flat_count;
    
    
    public Apartment(short id, int number, int count) {
        this.Apartment_id = id;
        this.apartment_number = number;
        this.flat_count = count;
    }
    
    // getters
    public short getApartmentId() {
        return this.Apartment_id;
    }

    public int getApartmentNumber() {
        return this.apartment_number;
    }

    public int getFlatCount() {
        return this.flat_count;
    }

    // setters
    public void setApartmentId(short id) {
        this.Apartment_id = id;
    }

    public void setApartmentNumber(int number) {
        this.apartment_number = number;
    }

    public void setFlatCount(int count) {
        this.flat_count = count;
    }

    // toString method
    public String toString() {
        return "Apartment ID: " + this.Apartment_id + ", Apartment Number: " + this.apartment_number + ", Flat Count: " + this.flat_count;
    }
    
     public Object getByName(String attributeName) {
	switch (attributeName) {
	case "Apartment_id": return this.Apartment_id;
	case "apartment_number": return this.apartment_number;
	case "flat_count": return this.flat_count;
	default: return null;
	}
    }
    
    
}
