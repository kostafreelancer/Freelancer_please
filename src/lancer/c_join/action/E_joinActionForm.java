package lancer.c_join.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class E_joinActionForm implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/c_join/e_join_step3.jsp");
		return forward;
	}

}
