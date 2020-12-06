package com.it.service;

import com.it.bean.City2;
import com.it.bean.City3;
import com.it.bean.QueryVo;
import com.it.dao.CityMapper;
import com.it.dao.ProvMapper;
import com.it.utils.MyBatisHelper;

import java.util.List;

public class CityServiceImpl implements CityService {

    CityMapper cityMapper = MyBatisHelper.getSqlSessionFactory().getMapper(CityMapper.class);

    @Override
    public List<City2> queryAllCityTest1() {
        return cityMapper.queryAllCityTest1();
    }

    @Override
    public List<City2> queryAllCityTest2() {
        return cityMapper.queryAllCityTest2();
    }

    @Override
    public List<City2> queryAllCityTest3(City2 city2) {
        return cityMapper.queryAllCityTest3(city2);
    }

    @Override
    public List<City3> queryAllCityTest4() {
        return cityMapper.queryAllCityTest4();
    }

}
