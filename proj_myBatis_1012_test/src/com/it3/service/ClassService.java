package com.it3.service;

import com.it3.bean.Classs;

import java.util.List;

public interface ClassService {
    List<Classs> queryAllClass();
    List<Classs> queryClassById(Integer sid);
}
