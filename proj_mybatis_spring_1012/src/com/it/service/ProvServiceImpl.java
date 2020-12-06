package com.it.service;

import com.it.bean.Prov;
import com.it.dao.ProvDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("provService")
public class ProvServiceImpl implements ProvService {
    @Resource
    ProvDAO provDAO;
    @Override
    public void addProv(Prov prov) {
        provDAO.addProv(prov);
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
