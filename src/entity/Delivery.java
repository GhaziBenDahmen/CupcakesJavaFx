/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Anis-PC
 */
public class Delivery {

    private int id;
    private String notes, email, adress, serviceType;
    private Date dateDelivery;
    private boolean status;

    public Delivery() {
    }

    public Delivery(int id, boolean status) {
        this.id = id;
        this.status = status;
    }

    public Delivery(int id, String notes, String email, String adress, String serviceType, Date dateDelivery, boolean status) {
        this.id = id;
        this.notes = notes;
        this.email = email;
        this.adress = adress;
        this.serviceType = serviceType;
        this.dateDelivery = dateDelivery;
        this.status = status;
    }

    public Delivery(String notes, String email, String adress, String serviceType, Date dateDelivery, boolean status) {
        this.notes = notes;
        this.email = email;
        this.adress = adress;
        this.serviceType = serviceType;
        this.dateDelivery = dateDelivery;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Date getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(Date dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Delivery other = (Delivery) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Delivery{" + "id=" + id + ", notes=" + notes + ", email=" + email + ", adress=" + adress + ", serviceType=" + serviceType + ", dateDelivery=" + dateDelivery + ", status=" + status + '}';
    }

}
