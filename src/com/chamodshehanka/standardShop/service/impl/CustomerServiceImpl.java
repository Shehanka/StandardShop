package com.chamodshehanka.standardShop.service.impl;

import com.chamodshehanka.standardShop.dao.CustomerDAO;
import com.chamodshehanka.standardShop.dao.impl.CustomerDAOImpl;
import com.chamodshehanka.standardShop.dto.CustomerDTO;
import com.chamodshehanka.standardShop.entity.Customer;
import com.chamodshehanka.standardShop.service.CustomerService;
import com.chamodshehanka.standardShop.util.HibernateUtil;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @author chamodshehanka on 11/7/2017
 * @project StandardShop
 **/
public class CustomerServiceImpl implements CustomerService{

    private Session session;
    CustomerDAO customerDAO = new CustomerDAOImpl();

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Transaction transaction = null;

        Customer customer = new Customer(
                customerDTO.getCustomerName(),
                customerDTO.getAddress(),
                customerDTO.getGender()
        );

        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            customerDAO.setSession(session);
            boolean isAdded = customerDAO.addCustomer(customer);

            if (isAdded) {
                transaction.commit();
                return true;
            } else {
                transaction.rollback();
                return false;
            }
        } catch (HandlerException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
            return false;
        }
    }

    @Override
    public CustomerDTO searchCustomer(int customerID) throws Exception {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            customerDAO.setSession(session);
//            Customer customer = CustomerDAO
        }catch (HandlerException e){

        }
        return null;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCustomer(int customerID) throws Exception {
        return false;
    }

}
