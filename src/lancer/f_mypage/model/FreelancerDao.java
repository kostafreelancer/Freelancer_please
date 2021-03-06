package lancer.f_mypage.model;

import java.io.InputStream;
import java.util.Date;
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
	
	public SqlSessionFactory getSqlSessionFactory(){      // sqlsessionfactory瑜� �뼸�뼱�샂
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
	
	public int updateFreelancerInfo(Freelancer freelancer){
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		try {			
			re =  session.getMapper(FreelancerMapper.class).updateFreelancerInfo(freelancer);
			if(re >0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}
	
	public void deleteFreelancerJobInfo(int f_num){
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		try {			
			re =  session.getMapper(FreelancerMapper.class).deleteFreelancerJobInfo(f_num);
			if(re >0){
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
	
	public int insertFreelancerJobInfo(F_job f_job){
		SqlSession session = getSqlSessionFactory().openSession();
		int re = -1;
		try {			
			re =  session.getMapper(FreelancerMapper.class).insertFreelancerJobInfo(f_job);
			if(re >0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}
	
	public String getFreelancerPassword(int f_num){
		SqlSession session = getSqlSessionFactory().openSession();
		String pwd="";
		try {			
			pwd =  session.getMapper(FreelancerMapper.class).getFreelancerPassword(f_num);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return pwd;
	}

	public List<Career> showCareerInfo(int f_num){
		SqlSession session = getSqlSessionFactory().openSession();
		try {			
			return session.getMapper(FreelancerMapper.class).showCareerInfo(f_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}
	public int getCareerNum(){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).getCareerNum();
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			session.close();
		}
		return re;
	}
	public int insertCareer(Career career){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).insertCareer(career);
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}
	public int updateCareer(Career career){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).updateCareer(career);
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}
	
	public int deleteCareer(int career_num){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).deleteCareer(career_num);
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}
	
	public List<School> showSchoolInfo(int f_num){
		SqlSession session = getSqlSessionFactory().openSession();
		try {			
			return session.getMapper(FreelancerMapper.class).showSchoolInfo(f_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}
	
	public int getSchoolNum(){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).getCareerNum();
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			session.close();
		}
		return re;
	}
	public int insertSchool(School school){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).insertSchool(school);
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}
	
	public int updateSchool(School school){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).updateSchool(school);
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}
	public int deleteSchool(int school_num){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).deleteSchool(school_num);
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}
	
	public List<Certificate> showCertiInfo(int f_num){
		SqlSession session = getSqlSessionFactory().openSession();
		try {			
			return session.getMapper(FreelancerMapper.class).showCertiInfo(f_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}
	public int getCertiNum(){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).getCertiNum();
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			session.close();
		}
		return re;
	}
	
	public int insertCerti(Certificate certificate){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).insertCerti(certificate);
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;	
	}
	
	public int updateCerti(Certificate certificate){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).updateCerti(certificate);
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}
	
	public int deleteCerti(int certificate_num){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re= session.getMapper(FreelancerMapper.class).deleteCerti(certificate_num);
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return re;
	}
	
	public String getMyProjectName(int f_num){
		SqlSession session = getSqlSessionFactory().openSession();
		String name = "";
		try {			
			name = session.getMapper(FreelancerMapper.class).getMyProjectName(f_num);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return name;
	}
	
	public List<Calendar> getMySchedule(int f_num){
		SqlSession session = getSqlSessionFactory().openSession();
		try {			
			return session.getMapper(FreelancerMapper.class).getMySchedule(f_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}
	
	public List<ApplyProject> getApplyProject(int f_num){
		SqlSession session = getSqlSessionFactory().openSession();
		try {			
			return session.getMapper(FreelancerMapper.class).getApplyProject(f_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}
	public int deleteApplyProject(int f_pr_num){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		try {			
			re = session.getMapper(FreelancerMapper.class).deleteApplyProject(f_pr_num);
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			session.close();
		}
		return re;
	}
	public Date getTemp(){
		SqlSession session = getSqlSessionFactory().openSession();
		int re=-1;
		Date date = new Date();
		try {			
			date = session.getMapper(FreelancerMapper.class).getTemp();
			if(re>0){
				session.commit();
			}else{
				session.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			session.close();
		}
		return date;
	}
}
