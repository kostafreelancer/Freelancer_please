package lancer.c_login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class c_logoutAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		ActionForward forward = new ActionForward();
		if(session.getAttribute("identity")!=null){
			session.invalidate();
			forward.setRedirect(true);
			forward.setPath("/Matching_Project/f_main/f_main.jsp");
		}else{
			forward.setRedirect(true);
			forward.setPath("/Matching_Project/c_login/login.jsp");
		}
		return forward;
	}

}
