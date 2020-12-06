package com.it.dao;

import com.it.bean.Prov;
import org.apache.ibatis.annotations.Select;

public interface ProvMapper {
    //根据城市编号查询省份
    @Select("SELECT p.*\n" +
            "FROM City AS c,Prov AS p\n" +
            "WHERE c.prov_id=p.prov_id\n" +
            "AND c.city_id=#{city_id}")
    Prov queryProvByCityId(String city_id);

    @Select("select * from Prov where prov_id=#{prov_id}")
    Prov getProvById2(String prov_id);
}
