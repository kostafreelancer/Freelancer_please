package lancer.e_mypage.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.e_mypage.mapper.E_MypageMapper;


public class E_MypageDao {
	
	private static E_MypageDao dao = new E_MypageDao();

	public static E_MypageDao getInstance() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory() { // sqlsessionfactory를 얻어옴
		String resource = "mybatis-config_e_mypage.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public Enterprise selectEnterprise(int e_num){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(E_MypageMapper.class).selectEnterprise(e_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	public List<Project> listProject(int e_num){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(E_MypageMapper.class).listProject(e_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	
	
}
