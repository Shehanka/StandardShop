package com.chamodshehanka.standardShop.dao;

import com.chamodshehanka.standardShop.entity.SuperEntity;
import org.hibernate.Session;

/**
 * @author chamodshehanka on 11/4/2017
 * @project StandardShop
 **/

public interface SuperDAO<T extends SuperEntity> {

    boolean add(T t)throws Exception;

    void setSession(Session session)throws Exception;

}
