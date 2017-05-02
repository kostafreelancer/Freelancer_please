package lancer.f_main.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface mainAction {
	public mainActionForward execute(HttpServletRequest request, HttpServletResponse response)throws Exception; 
}
