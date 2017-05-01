package lancer.e_insertproject.model;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.e_insertproject.mapper.E_InsertMapper;




public class E_InsertDao {
	private static E_InsertDao dao = new E_InsertDao();


	public static E_InsertDao getInstance(){
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory(){		// sqlsessionfactory를 얻어옴
		String resource = "mybatis-config.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public void insertProject(E_Insert project)throws Exception{	// 글 넣기 메소드
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
	
	
}
