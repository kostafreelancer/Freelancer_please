package lancer.c_join.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class E_joinActionForm implements Action {

	@Override
	public ActionForword execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForword forward = new ActionForword();
		forward.setRedirect(false);
		forward.setPath("/c_join/e_join_step3.jsp");
		return forward;
	}

}
