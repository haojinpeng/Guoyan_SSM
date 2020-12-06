package com.it.dao;

import com.it.bean.City2;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface CityMapper {
    //注解一对一
    //根据省份编号查询所有城市信息
    @Select("select * from City")
    /*
    * @Results的基本用法。当数据库字段名与实体类对应的属性名不一致时，
    * 可以使用@Results映射来将其对应起来。column为数据库字段名，property为实体类属性名，
    * jdbcType为数据库字段数据类型，id为是否为主键。
    * */
    @Results(
            value = {
                    //City2中的prov通过prov_id外键关联
                    @Result(property = "prov",column = "prov_id",
                            one = @One(select ="com.it.dao.ProvMapper.getProvById2"))
            }
    )
    List<City2> queryAllCity2();
}
