package com.it.mybatis.dao;

import java.util.List;

import com.it.mybatis.utils.MyBatisHelper;
import org.apache.ibatis.session.SqlSession;

import com.it.mybatis.bean.Prov;

public class ProvDAOImpl implements ProvDAO {

	SqlSession session = MyBatisHelper.getSqlSessionFactory();


	@Override
	public void addProv(Prov prov) {

		try {
			//session.update("addProv",prov);
			session.insert("addProv",prov);
			System.out.println("--操作成功!----------");
		}catch (Exception e){
			session.rollback();
	}
		finally {
			session.commit();
			session.close();
		}

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
