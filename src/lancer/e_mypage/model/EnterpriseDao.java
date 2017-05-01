package lancer.e_mypage.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.e_mypage.mapper.E_MypageMapper;


public class EnterpriseDao {
	
	private static EnterpriseDao dao = new EnterpriseDao();

	public static EnterpriseDao getInstance() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory() { // sqlsessionfactory를 얻어옴
		String resource = "E_Mypagemybatis-config.xml";			// 경로 확인 필요
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
			System.out.println("리소스 1");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("리소스 2");
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public Enterprise selectEnterprise(int e_num) throws Exception {
		System.out.println("셀렉트엔터프라이즈 1");
		SqlSession session = getSqlSessionFactory().openSession();
		System.out.println("셀렉트엔터프라이즈 2");
		try {
			
			return session.getMapper(E_MypageMapper.class).selectEnterprise(e_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	
	
}
