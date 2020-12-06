package com.it.service;

import com.it.bean.Prov;
import com.it.dao.ProvMapper;
import com.it.utils.MyBatisHelper;

public class ProvServiceImpl implements ProvService {
    ProvMapper provMapper = MyBatisHelper.getSqlSessionFactory().getMapper(ProvMapper.class);
    @Override
    public Prov getCitysById(String prov_id) {
        return provMapper.getCitysById(prov_id);
    }
}
