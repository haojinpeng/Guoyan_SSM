package com.it3.service;

import com.it3.bean.Classs;
import com.it3.dao.ClassMapper;
import com.it3.utils.MyBatisHelper;

import java.util.List;

public class ClassServiceImpl implements ClassService {
    ClassMapper classMapper = MyBatisHelper.getSqlSessionFactory().getMapper(ClassMapper.class);
    @Override
    public List<Classs> queryAllClass() {
        return classMapper.queryAllClass();
    }

    @Override
    public List<Classs> queryClassById(Integer sid) {
        return classMapper.queryClassById(sid);
    }
}
