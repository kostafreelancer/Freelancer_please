package lancer.c_freelancerlist.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.c_freelancerlist.mapper.c_freelancerMapper;
import lancer.c_login.model.c_loginDao;

public class c_freelancerlistDao {
	private static c_freelancerlistDao dao = new c_freelancerlistDao();

	public static c_freelancerlistDao getInstance() {
		return dao;
	}
	public SqlSessionFactory getSqlSessionFacotry() { // SqlSessionFactory 媛�
														// sqlsession�쓣 留뚮뱾湲� �쐞�븳
														// 怨듭옣?
		String resource = "mybatis-config_c_freelancerlist.xml"; // src�뿉 �꽔�뼱�꽌 洹몃깷 �씠�젃寃� �꽔�쓣�닔 �엲�쓬
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
	}
	public List<c_freelancerlist_total> select_freelancer_basic(){
		SqlSession session = getSqlSessionFacotry().openSession();
		c_freelancerlist_total totallist = null;
		List<c_freelancerlist_total> totallists = null;
		try{
			totallists = session.getMapper(c_freelancerMapper.class).c_freelancerlist_select_basic();
		}catch (Exception e) {
			e.printStackTrace();
		}
		for(int i = 0 ;i<totallists.size();i++){
			/*totallists.set(i, session.getMapper(c_freelancerMapper.class).c_freelancerlist_select_school(totallists.get(i).getF_num())); */ 
			List<c_freelancerlist_school> list_school = session.getMapper(c_freelancerMapper.class).c_freelancerlist_select_school(totallists.get(i).getF_num());
			totallists.get(i).setList_school(list_school);
			List<c_freelancerlist_career> list_career = session.getMapper(c_freelancerMapper.class).c_freelancerlist_select_career(totallists.get(i).getF_num());
			totallists.get(i).setList_career(list_career);
			List<c_freelancerlist_portfolio> list_portfolio = session.getMapper(c_freelancerMapper.class).c_freelancerlist_select_portfolio(totallists.get(i).getF_num());
			totallists.get(i).setList_portfolio(list_portfolio);
			List<String> list_job = session.getMapper(c_freelancerMapper.class).c_freelancerlist_select_job(totallists.get(i).getF_num());
			totallists.get(i).setList_job(list_job);
		}
	
		return totallists;
	}
	
	public String c_freelancer_list(){
		SqlSession session = getSqlSessionFacotry().openSession();
		String f_name=null;
		try{
			f_name = session.getMapper(c_freelancerMapper.class).c_freelancer_list();
			System.out.println(f_name);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return f_name;
	}
}
