package lancer.e_main.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface E_MainAction {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
