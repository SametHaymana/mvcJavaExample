/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sitemanagement.databaseproject.src.Models;

/**
 *
 * @author tomahawk
 */
public class Resident {
    
    private int FlatNumber;
    private int Apartment_id;
    private String Name;
    private String Surname;
    private String Tel;
    
    
    public Resident() {
    }

    public Resident(int flatNumber, int apartment_id, String name, String surname, String tel) {
        this.FlatNumber = flatNumber;
        this.Apartment_id = apartment_id;
        this.Name = name;
        this.Surname = surname;
        this.Tel = tel;
    }
    
    
    
    
    public int getFlatNumber() {
        return FlatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.FlatNumber = flatNumber;
    }

    public int getApartment_id() {
        return Apartment_id;
    }

    public void setApartment_id(int apartment_id) {
        this.Apartment_id = apartment_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        this.Tel = tel;
    }

    @Override
    public String toString() {
        return 
                "FlatNumber=" + FlatNumber +
                ", Apartment_id=" + Apartment_id +
                ", Name='" + Name + 
                ", Surname='" + Surname + 
                ", Tel='" + Tel  
                ;
    }

    public Object getByName(String attributeName) {
	switch (attributeName) {
	case "FlatNumber": return this.FlatNumber;
	case "Apartment_id": return this.Apartment_id;
	case "Name": return this.Name;
	case "Surname": return this.Surname;
        case "Tel": return this.Tel;
	default: return null;
	}
    }

}
