package com.chamodshehanka.standardShop.controller.impl;

import com.chamodshehanka.standardShop.controller.CustomerController;
import com.chamodshehanka.standardShop.dto.CustomerDTO;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 11/7/2017
 * @project StandardShop
 **/
public class CustomerControllerImpl implements CustomerController{

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        return false;
    }

    @Override
    public CustomerDTO searchCustomer(int customerID) throws Exception {
        return null;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCustomer(CustomerDTO customerDTO) throws Exception {
        return false;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() throws Exception {
        return null;
    }
}
