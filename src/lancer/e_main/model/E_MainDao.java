package lancer.e_main.model;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.c_login.model.c_login_enterprise;
import lancer.e_main.mapper.E_MainMapper;
import lancer.e_mypage.mapper.E_MypageMapper;


public class E_MainDao {
	
	private static E_MainDao dao = new E_MainDao();

	public static E_MainDao getInstance() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory() { // sqlsessionfactory를 얻어옴
		String resource = "mybatis-config_e_main.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new SqlSessionFactoryBuilder().build(in);
	}
	
	
	
	
	
	public int countFreelancer(){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(E_MainMapper.class).countFreelancer();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			session.close();
		}
	}
	public int countProject(){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(E_MainMapper.class).countProject();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			session.close();
		}
	}
	
	
	
}
