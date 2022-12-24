package com.sitemanagement.databaseproject.src.Models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomahawk
 */
public class Managers {
    
    private short Manager_id;
    private int Role;
    private boolean isResident;
    private String Name;
    private String Surname;
    private String Tel;
    private short Apartment_id;
    
    
    Managers(){
        
    }
    
    Managers(String name, String surname, int Role, short Apartment_id ){
        this.Name = name;
        this.Surname = surname;
        this.Role = Role;
        this.Apartment_id = Apartment_id;
    }
    
    Managers(String name, String surname,String Tel,boolean isResident, int Role, short Apartment_id ){
        this.Name = name;
        this.Surname = surname;
        this.Role = Role;
        this.Apartment_id = Apartment_id;
        this.Tel = Tel;
        this.isResident = isResident;
    
    }
    
    

    // getter for Manager_id
    public short getManagerId() {
        return Manager_id;
    }

    // setter for Manager_id
    public void setManagerId(short managerId) {
        this.Manager_id = managerId;
    }

    // getter for Role
    public int getRole() {
        return Role;
    }

    // setter for Role
    public void setRole(int role) {
        this.Role = role;
    }

    // getter for isResident
    public boolean getIsResident() {
        return isResident;
    }

    // setter for isResident
    public void setIsResident(boolean isResident) {
        this.isResident = isResident;
    }

    // getter for Name
    public String getName() {
        return Name;
    }

    // setter for Name
    public void setName(String name) {
        this.Name = name;
    }

    // getter for Surname
    public String getSurname() {
        return Surname;
    }

    // setter for Surname
    public void setSurname(String surname) {
        this.Surname = surname;
    }

    // getter for Tel
    public String getTel() {
        return Tel;
    }

    // setter for Tel
    public void setTel(String tel) {
        this.Tel = tel;
    }

    // getter for Apartment_id
    public short getApartmentId() {
        return Apartment_id;
    }

    // setter for Apartment_id
    public void setApartmentId(short apartmentId) {
        this.Apartment_id = apartmentId;
    }
    
    
    @Override
    public String toString() {
        return  "Manager_id=" + Manager_id +
                ", Role=" + Role +
                ", isResident=" + isResident +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Tel='" + Tel + '\'' +
                ", Apartment_id=" + Apartment_id 
                ;
    }
    
    public Object getByName(String attributeName) {
		switch (attributeName) {
		case "Manager_id": return this.Manager_id;
		case "Role": return this.Role;
		case "isResident": return this.isResident;
		case "Name": return this.Name;
		case "Surname": return this.Surname;
                case "Tel": return this.Tel;
		case "Apartment_id": return this.Apartment_id;
		default: return null;
		}
	}
    
    
    
    
    
}
