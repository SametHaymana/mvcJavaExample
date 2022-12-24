package com.sitemanagement.databaseproject.src.Models;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomahawk
 */
public class Outcome {
    
    private short Transction_id;
    private short Apartment_id;
    private short Manager_id;
    private boolean isRegular;
    private String Desciription;
    private float amount;
    private Date date;
    
    
    public Outcome(short transction_id, short apartment_id, short manager_id, boolean isRegular, String desciription, float amount, Date date) {
        this.Transction_id = transction_id;
        this.Apartment_id = apartment_id;
        this.Manager_id = manager_id;
        this.isRegular = isRegular;
        this.Desciription = desciription;
        this.amount = amount;
        this.date = date;
    }
    
    // Getters and Setters
    public short getTransction_id() {
        return Transction_id;
    }

    public void setTransction_id(short transction_id) {
        this.Transction_id = transction_id;
    }

    public short getApartment_id() {
        return Apartment_id;
    }

    public void setApartment_id(short apartment_id) {
        this.Apartment_id = apartment_id;
    }

    public short getManager_id() {
        return Manager_id;
    }

    public void setManager_id(short manager_id) {
        this.Manager_id = manager_id;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public void setRegular(boolean regular) {
        this.isRegular = regular;
    }

    public String getDesciription() {
        return Desciription;
    }

    public void setDesciription(String desciription) {
        this.Desciription = desciription;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // toString Method
    @Override
    public String toString() {
        return 
                "Transction_id=" + Transction_id +
                ", Apartment_id=" + Apartment_id +
                ", Manager_id=" + Manager_id +
                ", isRegular=" + isRegular +
                ", Desciription='" + Desciription +
                ", amount=" + amount +
                ", Date=" + date; 
    }
    
    public Object getByName(String attributeName) {
	switch (attributeName) {
	case "Manager_id": return this.Manager_id;
	case "Transction_id": return this.Transction_id;
	case "isRegular": return this.isRegular;
	case "Desciription": return this.Desciription;
	case "amount": return this.amount;
        case "date": return this.date;
	default: return null;
	}
    }
}
