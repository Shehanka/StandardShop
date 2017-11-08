package com.chamodshehanka.standardShop.dao;

import com.chamodshehanka.standardShop.entity.Customer;
import org.hibernate.Session;

/**
 * @author chamodshehanka on 10/30/2017
 * @project StandardShop
 **/
public interface CustomerDAO {

    public boolean addCustomer(Customer customer)throws Exception;

    public Customer searchCustomer(int customerID)throws Exception;

    public boolean updateCustomer(Customer customer)throws Exception;

    public boolean deleteCustomer(int customerID)throws Exception;

    public void setSession(Session session)throws Exception;

}
