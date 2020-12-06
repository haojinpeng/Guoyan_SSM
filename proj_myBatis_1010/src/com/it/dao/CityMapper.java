package com.it.dao;

import com.it.bean.City;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CityMapper {
    //一对多
    //根据省份编号查询城市
    @Select("select * from city where prov_id=#{prov_id}")
    List<City> getCityByProv_id(String prov_id);
}
