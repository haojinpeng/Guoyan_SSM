package com.it2.service;

import com.it2.bean.Prov;
import com.it2.dao.ProvMapper;
import com.it2.utils.MyBatisHelper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ProvServiceImpl implements ProvService {

    ProvMapper provMapper = MyBatisHelper.getSqlSessionFactory().getMapper(ProvMapper.class);
    @Override
    public void addProv(Prov prov) {
        provMapper.addProv(prov);
    }

    @Override
    public void delProv(Prov prov) {
        provMapper.delProv(prov);
    }

    @Override
    public void updProv(Prov prov) {
        provMapper.updProv(prov);
    }

    @Override
    public List<Prov> queryAll(Prov prov) {
        return provMapper.queryAll(prov);
    }

    @Override
    public Prov findById(Prov prov) {
        return provMapper.findById(prov);
    }

    @Override
    public List<Prov> selectProv2(Prov prov) {
        return null;
    }
}
