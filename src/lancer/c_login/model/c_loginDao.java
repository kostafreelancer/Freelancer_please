package lancer.c_login.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.c_login.mapper.c_loginMapper;



public class c_loginDao {
	private static c_loginDao dao = new c_loginDao();

	public static c_loginDao getInstance() {
		return dao;
	}

	public SqlSessionFactory getSqlSessionFacotry() { // SqlSessionFactory 가
														// sqlsession을 만들기 위한
														// 공장?
		String resource = "mybatis-config_login.xml"; // src에 넣어서 그냥 이렇게 넣을수 잇음
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);

	}
	public String select_c_login(c_login client){
		SqlSession session = getSqlSessionFacotry().openSession();
		
		String name = null;
		name = session.getMapper(c_loginMapper.class).select_c_login(client);
		if(name != null){
			return name;
		}else{
			return null;
		}
		
	}
	
}
