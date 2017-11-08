package com.chamodshehanka.standardShop.dto;

/**
 * @author chamodshehanka on 10/30/2017
 * @project StandardShop
 **/
public class CustomerDTO {
    private int customerID;
    private String customerName;
    private String address;
    private String gender;

    public CustomerDTO() {
    }

    public CustomerDTO(int customerID, String customerName, String address, String gender) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.gender = gender;
    }

    public CustomerDTO(String customerName, String address, String gender) {
        this.customerName = customerName;
        this.address = address;
        this.gender = gender;
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
