package com.it.springboot.service;

import com.it.springboot.dao.UserMapper;
import com.it.springboot.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/11/12 14:48
 * @description：
 * @modified By：
 * @version:     $
 */
 @Service
 //// 本类内方法指定使用缓存时，默认的名称就是userInfoCache11
 @CacheConfig(cacheNames = {"userInfoCache11"})
 @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
public class UserServiceImpl implements UserService {
     @Resource
     UserMapper userMapper;
     //// @Cacheable 会先查询缓存，如果缓存中存在，则不执行方法
     @Nullable
     //@Cacheable(key = "#p0")
     @Cacheable(key = "#id")
     @Override
    public User find(String id) {
         System.err.println("根据id=" + id +"获取用户对象，从数据库中获取");
         Assert.notNull(id,"id不用为空");
        return userMapper.find(id);
    }

    @Override
    public void insert(User u) {
         userMapper.insert(u);
    }

    @CachePut(key = "#p0.id")
    @Override
    public User update(User u) {
        System.out.println("修改"+u.getId()+"用户信息");
        userMapper.update(u);
        //可能只是更新某几个字段而已，所以查次数据库把数据全部拿出来全部
        return userMapper.find(u.getId());
    }

    @Override
    public void delete(String id) {
        userMapper.delete(id);

    }

    @Override
    public void deleteAll() {
        userMapper.deleteAll();

    }


}
