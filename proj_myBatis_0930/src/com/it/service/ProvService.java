package com.it.service;

import com.it.bean.Prov;

import java.util.List;

public interface ProvService {
	//一个省份对应多个城市
	List<Prov> queryAllCityByProvId();
}
