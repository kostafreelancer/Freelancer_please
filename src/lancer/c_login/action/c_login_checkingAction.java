package lancer.c_login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.c_login.model.c_login;
import lancer.c_login.model.c_loginDao;
import lancer.c_login.model.checking_identity;

public class c_login_checkingAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int c_num =0;
		
		
		checking_identity identity;
		c_loginDao dao = c_loginDao.getInstance();
		c_login client = new c_login();
		client.setC_id(request.getParameter("c_id"));
		client.setPwd(request.getParameter("pwd"));
		System.out.println(client);
		identity = dao.select_c_login(client,request.getParameter("checking"));
		System.out.println("여기도 안들어와?");
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		if(identity.getIdentity().equals("freelancer")){
			forward.setPath("/Matching_Project/f_main/f_main.jsp");
		}else if(identity.getIdentity().equals("enterprise")){
			forward.setPath("/Matching_Project/e_main/e_main.jsp");
		}
		System.out.println(forward+"액션에서 포워드 ");
		HttpSession session = request.getSession();
		session.setAttribute("num", identity.getC_num());
		session.setAttribute("identity", identity.getIdentity());
		return forward;
	}

}
