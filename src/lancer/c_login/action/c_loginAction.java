package lancer.c_login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.c_login.model.c_login;
import lancer.c_login.model.c_loginDao;
import lancer.c_login.model.c_login_freelancer;
import lancer.c_login.model.checking_identity;

public class c_loginAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		c_loginDao dao = c_loginDao.getInstance();
		c_login client = new c_login();
		checking_identity identity=null;
		c_login_freelancer free = new c_login_freelancer();
		client.setC_id(request.getParameter("c_id"));
		client.setPwd(request.getParameter("pwd"));
		identity = dao.select_c_login_contents(client,request.getParameter("checking")); 
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		HttpSession session = request.getSession();
		if(identity.getIdentity().equals("freelancer")){
			forward.setPath("/Matching_Project/f_main/f_main.jsp");
			session.setAttribute("client", identity.getFree());
		}else if(identity.getIdentity().equals("enterprise")){
			forward.setPath("/Matching_Project/e_main/e_main.jsp");
			session.setAttribute("client", identity.getEnter());
		}
		System.out.println(identity.getIdentity());		
		session.setAttribute("identity", identity);
		return forward;
	}
	
}
