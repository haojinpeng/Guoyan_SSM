package com.it.service;

import com.it.bean.Prov;
import com.it.dao.ProvDAO;
import com.it.dao.ProvDAOImpl;

import java.util.List;
 
public class ProvServiceImpl implements ProvService {

    ProvDAO provDAO = new ProvDAOImpl();

    @Override
    public void addProv(Prov prov) {
        provDAO.addProv(prov);
    }

    @Override
    public void delProv(Prov prov) {
        provDAO.delProv(prov);
    }

    @Override
    public void updProv(Prov prov) {
        provDAO.updProv(prov);
    }

    @Override
    public List<Prov> queryAll(Prov prov) {
        return provDAO.queryAll(prov);
    }

    @Override
    public Prov findById(Prov prov) {
        return provDAO.findById(prov);
    }

    @Override
    public List<Prov> selectProv2(Prov prov) {
        return null;
    }
}
