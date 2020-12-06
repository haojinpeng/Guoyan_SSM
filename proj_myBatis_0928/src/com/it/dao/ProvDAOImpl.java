package com.it.dao;

import java.util.List;

import com.it.utils.MyBatisHelper;
import org.apache.ibatis.session.SqlSession;

import com.it.bean.Prov;

public class ProvDAOImpl implements ProvDAO {

	SqlSession session = MyBatisHelper.getSqlSessionFactory();

	@Override
	public void addProv(Prov prov) {
		try {
			session.insert("addProv",prov);
			System.out.println("--操作成功!--");
		} catch (Exception e){
			e.printStackTrace();
			session.rollback();
		} finally {
			session.commit();
			session.close();
		}
	}

	@Override
	public void delProv(Prov prov) {
		try {
			session.delete("delProv",prov);
			System.out.println("操作成功！");
		}catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.commit();
			session.close();
		}
	}

	@Override
	public void updProv(Prov prov) {
		try {
			session.update("updProv",prov);
			System.out.println("操作成功！");
		}catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.commit();
			session.close();
		}
	}

	@Override
	public List<Prov> queryAll(Prov prov) {
		List<Prov> provList = null;
		try {
			provList = session.selectList("queryAll",prov);
			System.out.println(provList.size());
			System.out.println("操作成功！");
		}catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.commit();
			session.close();
		}
		return provList;
	}

	@Override
	public Prov findById(Prov prov) {
		Prov provs = null;
		try {
			provs = session.selectOne("findById",prov);
			System.out.println("操作成功！");
		}catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.commit();
			session.close();
		}
		return provs;
	}

	@Override
	public List<Prov> selectProv2(Prov prov) {
		return null;
	}
}
