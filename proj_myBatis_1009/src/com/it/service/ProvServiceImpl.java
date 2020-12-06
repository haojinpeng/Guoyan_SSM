package com.it.service;

import com.it.bean.Prov;
import com.it.dao.ProvMapper;
import com.it.utils.MyBatisHelper;

public class ProvServiceImpl implements ProvService {
    ProvMapper provMapper = MyBatisHelper.getSqlSessionFactory().getMapper(ProvMapper.class);

    @Override
    public Prov queryProvByCityId(String city_id) {
        return provMapper.queryProvByCityId(city_id);
    }

    @Override
    public Prov getProvById2(String prov_id) {
        return provMapper.getProvById2(prov_id);
    }
}
