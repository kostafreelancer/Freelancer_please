package lancer.c_join.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.c_join.mapper.E_joinMapper;

public class E_joinDAO {
	private static E_joinDAO dao = new E_joinDAO();

	public static E_joinDAO getInstance() {
		return dao;
	}

	public SqlSessionFactory getSqlSessionFactory() {
		String resource = "mybatis-config_c_join.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}

	public void insert_e_join(E_join e_join) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = session.getMapper(E_joinMapper.class).insert_e_join(e_join);
			if (re > 0) {
				session.commit();
			} else {
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	public int getnum(){
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			return session.getMapper(E_joinMapper.class).getnum();
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			session.close();
		}
	}
	
}