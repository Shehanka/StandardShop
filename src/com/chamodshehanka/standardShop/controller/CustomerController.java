package com.chamodshehanka.standardShop.controller;

import com.chamodshehanka.standardShop.dto.CustomerDTO;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 11/7/2017
 * @project StandardShop
 **/
public interface CustomerController {

    public boolean addCustomer(CustomerDTO customerDTO)throws Exception;

    public CustomerDTO searchCustomer(int customerID)throws Exception;

    public boolean updateCustomer(CustomerDTO customerDTO)throws Exception;

    public boolean deleteCustomer(CustomerDTO customerDTO)throws Exception;

    public ArrayList<CustomerDTO> getAllCustomer()throws Exception;

}
