package com.it.service;

import com.it.bean.Prov;
import com.it.bean.QueryVo;

import java.util.List;

public interface ProvService {
	//传递简单类型
	Prov selectProvById(QueryVo queryVo);
	//输出简单类型 int 获取总记录数
	int getCount();
	//演示动态sql  if,where
	List<Prov> queryAll2(Prov prov);

}
