package com.it.mybatis.service;

import com.it.mybatis.bean.Prov;
import com.it.mybatis.dao.ProvDAO;
import com.it.mybatis.dao.ProvDAOImpl;

import java.util.List;

 
public class ProvServiceImpl implements ProvService {

    ProvDAO provDAO = new ProvDAOImpl();

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
