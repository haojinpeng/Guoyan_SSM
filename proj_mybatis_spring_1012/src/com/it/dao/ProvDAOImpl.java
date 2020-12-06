package com.it.dao;

import com.it.bean.Prov;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Repository(value = "provDAO")
public class ProvDAOImpl extends SqlSessionDaoSupport implements ProvDAO {

    SqlSession sqlSession = null;
    @Resource
    SqlSessionFactory sqlSessionFactory;
    @PostConstruct
    public void init(){
        //调用了父类中的SqlSession
        super.setSqlSessionFactory(sqlSessionFactory);
        sqlSession  = super.getSqlSession();
    }
    @Override
    public void addProv(Prov prov) {
        sqlSession.insert("com.addProv",prov);
    }

    @Override
    public void delProv(Prov prov) {

    }

    @Override
    public void updProv(Prov prov) {

    }

    @Override
    public List<Prov> queryAll(Prov prov) {
        return null;
    }

    @Override
    public Prov findById(Prov prov) {
        return null;
    }

    @Override
    public List<Prov> selectProv2(Prov prov) {
        return null;
    }
}
