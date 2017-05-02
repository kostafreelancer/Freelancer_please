package lancer.f_mypage.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.f_mypage.mapper.FreelancerMapper;

public class FreelancerDao {
	private static FreelancerDao dao = new FreelancerDao();
	
	public static FreelancerDao getInstance(){
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory(){      // sqlsessionfactory를 얻어옴
	      String resource = "mybatis-config_f_mypage.xml";
	      InputStream in = null;
	      try {
	         in = Resources.getResourceAsStream(resource);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      return new SqlSessionFactoryBuilder().build(in);
	   }
	
	public Freelancer showFreelancerInfo(int f_num){
		SqlSession session = getSqlSessionFactory().openSession();

		try {			
			return session.getMapper(FreelancerMapper.class).showFreelancerInfo(f_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}
	
	public List<Integer> showFreelancerJobInfo(int f_num){
		SqlSession session = getSqlSessionFactory().openSession();
	
		try {			
			return session.getMapper(FreelancerMapper.class).showFreelancerJobInfo(f_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}

}
