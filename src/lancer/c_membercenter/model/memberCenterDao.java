package lancer.c_membercenter.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.c_membercenter.mapper.memberCenter_mapper;

public class memberCenterDao {
	public static memberCenterDao cDao = new memberCenterDao();
	
	public static memberCenterDao getInstance(){
		return cDao;
	};
	
	public SqlSessionFactory getSqlSessionFactory(){
	
		String resource = "mybatis-config_c_membercenter.xml";
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
	};
	
	public memberCenter f_name(int f_num){
		
		SqlSession sqlsession = getSqlSessionFactory().openSession();
		try {
			return sqlsession.getMapper(memberCenter_mapper.class).getFname(f_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			sqlsession.close();
		}
		
	}
}
