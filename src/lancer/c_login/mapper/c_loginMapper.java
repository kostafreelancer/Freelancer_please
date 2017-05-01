package lancer.c_login.mapper;

import lancer.c_login.model.c_login;
import lancer.c_login.model.c_login_enterprise;
import lancer.c_login.model.c_login_freelancer;

public interface c_loginMapper {
	public Integer select_c_login_f(c_login client);
	public Integer select_c_login_e(c_login client);
	public c_login_freelancer select_f_login(c_login client);
	public c_login_enterprise select_e_login(c_login client);
	
}
