package com.it.service;

import com.it.bean.City;
import com.it.dao.CityMapper;
import com.it.utils.MyBatisHelper;

import java.util.List;

public class CityServiceImpl implements CityService {
    CityMapper cityMapper = MyBatisHelper.getSqlSessionFactory().getMapper(CityMapper.class);
    @Override
    public List<City> getCityByProv_id(String prov_id) {
        return cityMapper.getCityByProv_id(prov_id);
    }
}
