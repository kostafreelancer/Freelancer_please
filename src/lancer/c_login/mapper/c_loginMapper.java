package lancer.c_login.mapper;

import lancer.c_login.model.c_login;

public interface c_loginMapper {
	public int select_c_login_f(c_login client);
	public int select_c_login_e(c_login client);
}
