package lancer.e_insertproject.model;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.c_join.mapper.E_joinMapper;
import lancer.e_insertproject.mapper.E_InsertMapper;
import lancer.e_mypage.mapper.E_MypageMapper;
import lancer.e_mypage.model.Enterprise;




public class E_InsertDao {
	private static E_InsertDao dao = new E_InsertDao();


	public static E_InsertDao getInstance(){
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory(){		
		String resource = "mybatis-config_e_insertproject.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public void insertProject(E_Insert project)throws Exception{	
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		
		try {
			re = session.getMapper(E_InsertMapper.class).insertProject(project);
			if(re > 0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public int getnum(){
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			return session.getMapper(E_InsertMapper.class).getnum();
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			session.close();
		}
	}
	
	public void insertP_Job(Map<String, Integer> map)throws Exception{	
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		
		try {
			re = session.getMapper(E_InsertMapper.class).insertP_Job(map);
			if(re > 0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

	

}
