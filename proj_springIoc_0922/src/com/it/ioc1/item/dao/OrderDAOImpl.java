package com.it.ioc1.item.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Repository：dao 层
@Component("orderDAOImpl")
//等价<bean id="orderDAOImpl" class="com.it.ioc1.item.dao.OrderDAOImpl"></bean>

public class OrderDAOImpl implements IOrderDAO  {
    @Override
    public void addOrder()
    {
        System.out.println("---OrderDAOImpl add--------------");
    }
}
