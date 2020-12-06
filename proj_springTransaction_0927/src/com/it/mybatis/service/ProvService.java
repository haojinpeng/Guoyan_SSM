package com.it.mybatis.service;

import com.it.mybatis.bean.Prov;

import java.util.List;

public interface ProvService {
	 void addProv(Prov prov);
	 void delProv(Prov prov);
	 void updProv(Prov prov);
	 List<Prov> queryAll(Prov prov);
	 Prov findById(Prov prov);
	 List<Prov> selectProv2(Prov prov);
}
