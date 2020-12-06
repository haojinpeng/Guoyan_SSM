package com.it3.service;

import com.it3.bean.Prov;
import com.it3.dao.ProvMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("provService")
public class ProvServiceImpl implements ProvService {
    @Resource
    ProvMapper provMapper;
    @Override
    public void addProv(Prov prov) {
        provMapper.addProv(prov);
    }

    @Override
    public void delProv(Prov prov) {

    }

    @Override
    public void updProv(Prov prov) {

    }

    @Override
    public List<Prov> queryAll(Prov prov) {
        return null;
    }

    @Override
    public Prov findById(Prov prov) {
        return null;
    }

    @Override
    public List<Prov> selectProv2(Prov prov) {
        return null;
    }
}
