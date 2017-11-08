package com.chamodshehanka.standardShop.service;

import com.chamodshehanka.standardShop.dto.CustomerDTO;

/**
 * @author chamodshehanka on 11/7/2017
 * @project StandardShop
 **/
public interface CustomerService {

    public boolean addCustomer(CustomerDTO customerDTO)throws Exception;

    public CustomerDTO searchCustomer(int customerID)throws Exception;

    public boolean updateCustomer(CustomerDTO customerDTO)throws Exception;

    public boolean deleteCustomer(int customerID)throws Exception;

}