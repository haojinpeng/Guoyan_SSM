package com.it.service;

import com.it.bean.City2;
import com.it.dao.CityMapper;
import com.it.utils.MyBatisHelper;

import java.util.List;

public class CityServiceImpl implements CityService {
    CityMapper cityMapper = MyBatisHelper.getSqlSessionFactory().getMapper(CityMapper.class);

    //一对一关系
    @Override
    public List<City2> queryAllCity2() {
        return cityMapper.queryAllCity2();
    }
}
