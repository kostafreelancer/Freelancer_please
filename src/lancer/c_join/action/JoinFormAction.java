package lancer.c_join.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JoinFormAction implements Action {

	@Override
	public ActionForword execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	

		ActionForword forward = new ActionForword();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/c_join/c_join_step1.jsp");
		
		return forward;
	}

}
