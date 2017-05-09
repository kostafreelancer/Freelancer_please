package lancer.c_join.model;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

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

	//connection 추가
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

	public void insert_e_join(E_join e_join) throws Exception {
		SqlSession session = getSqlSessionFactory().openSession();
/*		System.out.println(e_join.getE_address());
		System.out.println(e_join.getE_bf());
		System.out.println(e_join.getE_capital());
		System.out.println(e_join.getE_check());
		System.out.println(e_join.getE_ename());
		System.out.println(e_join.getE_enum());
		System.out.println(e_join.getE_homepage());
		System.out.println(e_join.getE_id());
		System.out.println(e_join.getE_licensefile());
		System.out.println(e_join.getE_listing());
		System.out.println(e_join.getE_mail());
		System.out.println(e_join.getE_name());
		System.out.println(e_join.getE_num());
		System.out.println(e_join.getE_owner());
		System.out.println(e_join.getE_ownerfile());
		System.out.println(e_join.getE_phone());
		System.out.println(e_join.getE_pwd());
		System.out.println(e_join.getE_regno());
		System.out.println(e_join.getE_sales());
		System.out.println(e_join.getE_scale());
		System.out.println(e_join.getE_score());
		System.out.println(e_join.getManager_hphone());
		System.out.println(e_join.getManager_mail());
		System.out.println(e_join.getManager_name());
		System.out.println(e_join.getStart_year());*/

		
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
	
	public List<String> getAllId(){
		SqlSession session = getSqlSessionFactory().openSession();
	
		try {
			return session.getMapper(E_joinMapper.class).getAllId();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
}