package com.it.dao;

import com.it.bean.Prov;

import java.util.List;

public interface ProvMapper {
    //一个省份对应多个城市
    List<Prov> queryAllCityByProvId();
}
