package com.it.dao;

import com.it.bean.City2;
import com.it.bean.City3;

import java.util.List;

public interface CityMapper {
    //实体类字段与数据库不一致情况下查询所有
    List<City2> queryAllCityTest1();
    //动态sql判断代码块抽取出来，组成一个sql片段
    List<City2> queryAllCityTest2();
    //按照多个id查询多个城市信息
    List<City2> queryAllCityTest3(City2 city2);
    //一对一关系 按照
    List<City3> queryAllCityTest4();
}
