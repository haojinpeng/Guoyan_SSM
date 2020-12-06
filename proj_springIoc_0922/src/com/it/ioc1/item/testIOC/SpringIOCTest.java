package com.it.ioc1.item.testIOC;

import com.it.ioc1.item.pojo.Order;
import com.it.ioc1.item.services.IOrderService;
import com.it.ioc1.item.services.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOCTest {

    @Test
    public void addOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IOrderService service = context.getBean("orderServiceImpl", OrderServiceImpl.class);
        service.addOrder();
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void testBean() {
        //读取配置文件信息
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("第四步 获取创建 bean 实例对象");
        System.out.println(order);
        //手动让 bean 实例销毁
        context.close();
    }

}
