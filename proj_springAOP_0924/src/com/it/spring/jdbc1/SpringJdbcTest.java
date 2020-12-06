package com.it.spring.jdbc1;
//spring集成JDBC

//原生态，无配置文件，没有交给Spring
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringJdbcTest {
    @Test
    public void test1(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/db");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        int rs = jdbcTemplate.update("insert into account(NAME,money) value(?,?)","haha",3 );
        System.out.println(rs);
    }
}
