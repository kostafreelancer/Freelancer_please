package lancer.c_join.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	public ActionForword execute(HttpServletRequest request, HttpServletResponse response)throws Exception;
}
