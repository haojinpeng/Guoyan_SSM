package com.it3.dao;

import com.it3.bean.Prov;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.util.List;

//注解版
@Repository("provMapper")
public interface ProvMapper {
	@Insert("insert into prov values(#{prov_id},#{prov_name})")
	 void addProv(Prov prov);
	 void delProv(Prov prov);
	 void updProv(Prov prov);
	 List<Prov> queryAll(Prov prov);
	 Prov findById(Prov prov);
	 List<Prov> selectProv2(Prov prov);
}
