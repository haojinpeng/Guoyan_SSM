package com.it.dao;

import com.it.bean.Prov;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ProvMapper {
    //根据省份编号查询该省份下的所有城市信息
    @Select("select * from prov where prov_id=#{prov_id}")
    @Results(value = {
            @Result(id=true,column = "prov_id",property = "prov_id"),
            @Result(column = "prov_name",property = "prov_name"),
            @Result(column = "prov_id",property = "citysSet",
            many = @Many(
                    select = "com.it.dao.CityMapper.getCityByProv_id"
            ))
    })
    Prov getCitysById(String prov_id);
}
