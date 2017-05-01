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
	public SqlSessionFactory getSqlSessionFacotry() { // SqlSessionFactory 媛�
														// sqlsession�쓣 留뚮뱾湲� �쐞�븳
														// 怨듭옣?
		String resource = "mybatis-config_login.xml"; // src�뿉 �꽔�뼱�꽌 洹몃깷 �씠�젃寃� �꽔�쓣�닔 �엲�쓬
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);

	}
	public checking_identity select_c_login(c_login client,String checking){
		SqlSession session = getSqlSessionFacotry().openSession();
		Integer f_num =0;
		Integer e_num =0;
		checking_identity identity = new checking_identity();
		
		if(checking.equals("freelancer")){
			f_num = session.getMapper(c_loginMapper.class).select_c_login_f(client);
			identity.setC_num(f_num);
			identity.setIdentity("freelancer");
			return identity;
		}else if(checking.equals("enterprise")){
			e_num = session.getMapper(c_loginMapper.class).select_c_login_e(client);
			identity.setC_num(e_num);
			identity.setIdentity("enterprise");
			return identity;
		}else{
			return null;
		}
		
	}
	
}
