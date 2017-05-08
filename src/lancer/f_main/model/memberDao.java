package lancer.f_main.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.f_main.mapper.f_main_mapper;

public class memberDao {

	public static memberDao dao = new memberDao();
	
	public static memberDao getInstance(){
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory(){
		
		String resource = "mybatis-config_f_main.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
	};
	
	public List<member> getF_info()throws Exception{
		SqlSession sqlsession = getSqlSessionFactory().openSession();
		try {
			return sqlsession.getMapper(f_main_mapper.class).getF_info();
		} catch (Exception e) {
			e.printStackTrace();
			
			return null;
		}finally {
			sqlsession.close();
		}
	};
	
	public int countfreelancer() throws Exception{
		SqlSession sqlsession = getSqlSessionFactory().openSession();
		
		try {
			return sqlsession.getMapper(f_main_mapper.class).countFreelancer();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlsession.close();
		}
		
		return countfreelancer();
	}
}
