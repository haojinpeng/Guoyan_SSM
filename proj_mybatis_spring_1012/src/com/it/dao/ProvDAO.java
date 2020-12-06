package com.it.dao;

import com.it.bean.Prov;

import java.util.List;
//xml
public interface ProvDAO {
	 void addProv(Prov prov);
	 void delProv(Prov prov);
	 void updProv(Prov prov);
	 List<Prov> queryAll(Prov prov);
	 Prov findById(Prov prov);
	 List<Prov> selectProv2(Prov prov);
}
