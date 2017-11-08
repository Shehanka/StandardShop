package com.chamodshehanka.standardShop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author chamodshehanka on 11/4/2017
 * @project StandardShop
 **/

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerID;
    private String customerName;
    private String address;
    private String gender;

    public Customer() {
    }

    public Customer(int customerID, String customerName, String address, String gender) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.gender = gender;
    }

    public Customer(String customerName, String address, String gender) {
        this.customerName = customerName;
        this.address = address;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
