package lancer.c_freelancerlist.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.c_login.model.c_loginDao;

public class c_freelancerDao {
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
}
