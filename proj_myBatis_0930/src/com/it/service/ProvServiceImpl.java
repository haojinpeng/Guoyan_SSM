package com.it.service;

import com.it.utils.MyBatisHelper;
import com.it.bean.Prov;
import com.it.dao.ProvMapper;

import java.util.List;
 
public class ProvServiceImpl implements ProvService {

   ProvMapper provMapper = MyBatisHelper.getSqlSessionFactory().getMapper(ProvMapper.class);
    @Override
    public List<Prov> queryAllCityByProvId() {
        return provMapper.queryAllCityByProvId();
    }
}
