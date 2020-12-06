package com.it2.dao;

import com.it2.bean.Prov;
import org.springframework.stereotype.Repository;

import java.util.List;
//动态代理
@Repository("provMapper")
public interface ProvMapper {
	 void addProv(Prov prov);
	 void delProv(Prov prov);
	 void updProv(Prov prov);
	 List<Prov> queryAll(Prov prov);
	 Prov findById(Prov prov);
	 List<Prov> selectProv2(Prov prov);
}
