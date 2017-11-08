package com.chamodshehanka.standardShop.dao.impl;

import com.chamodshehanka.standardShop.dao.CustomerDAO;
import com.chamodshehanka.standardShop.entity.Customer;
import org.hibernate.Session;

import java.io.Serializable;

/**
 * @author chamodshehanka on 10/30/2017
 * @project StandardShop
 **/
public class CustomerDAOImpl implements CustomerDAO{

    private Session session;

    @Override
    public boolean addCustomer(Customer customer) throws Exception {
        Serializable save = session.save(customer);
        return save != null;
    }

    @Override
    public Customer searchCustomer(int customerID) throws Exception {
        return (Customer) session.createQuery("FROM Customer WHERE 'customerID'='"+customerID+"'").list().get(0);
    }

    @Override
    public boolean updateCustomer(Customer customer) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCustomer(int customerID) throws Exception {
        return false;
    }

    @Override
    public void setSession(Session session) throws Exception {
        this.session = session;
    }
}
