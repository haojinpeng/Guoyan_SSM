package com.it.service;

import com.it.bean.QueryVo;
import com.it.utils.MyBatisHelper;
import com.it.bean.Prov;
import com.it.dao.ProvMapper;

import java.util.List;

 
public class ProvServiceImpl implements ProvService {

    ProvMapper provMapper = MyBatisHelper.getSqlSessionFactory().getMapper(ProvMapper.class);

    @Override
    public Prov selectProvById(QueryVo queryVo) {
        return provMapper.selectProvById(queryVo);
    }

    @Override
    public int getCount() {
        return provMapper.getCount();
    }

    @Override
    public List<Prov> queryAll2(Prov prov) {
        return provMapper.queryAll2(prov);
    }
}
