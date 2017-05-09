package lancer.c_join.model;

import java.io.InputStream;
import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import lancer.c_join.mapper.F_joinMapper;
import lancer.e_insertproject.mapper.E_InsertMapper;

public class F_joinDAO {
	private static F_joinDAO dao = new F_joinDAO();
	
	public static F_joinDAO getInstance(){
		return dao;
	}
	
    public Connection getConnection(){
        DataSource ds = null;
        try{
                  Context ctx = new InitialContext();
                  ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
                  return ds.getConnection();
        }catch (Exception e) {
                  e.printStackTrace();
        }
        return null;
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
    
    public void insert_f_join(F_join f_join) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
		
		int re = -1;
		try {
			re = session.getMapper(F_joinMapper.class).insert_f_join(f_join);
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
			return session.getMapper(F_joinMapper.class).getnum();
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			session.close();
		}
	}
	
	public List<String> getAllId(){
		SqlSession session = getSqlSessionFactory().openSession();
	
		try {
			return session.getMapper(F_joinMapper.class).getAllId();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	public int insert_F_Job(F_job f_job){
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = session.getMapper(F_joinMapper.class).insert_F_Job(f_job);
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
		return re;
	}
}
