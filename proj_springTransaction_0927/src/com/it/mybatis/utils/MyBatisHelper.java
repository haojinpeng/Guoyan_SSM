package com.it.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisHelper {
    private static  String resource = "mybatis-config.xml";
    private   static InputStream inputStream = null;
    private   static SqlSessionFactory sqlSessionFactory = null;

    private  MyBatisHelper(){

    }
    static {
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
          } catch (IOException e) {
            e.printStackTrace();
            System.out.println("-----mybatis-config.xml加载失败-------------");
        }
    }

    /**
     * 返回 SqlSession
     * @return
     */
    public static SqlSession  getSqlSessionFactory(){

        return  sqlSessionFactory.openSession();
    }

}
