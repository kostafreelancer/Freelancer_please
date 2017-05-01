package lancer.c_login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.c_login.model.c_login;
import lancer.c_login.model.c_loginDao;

public class c_login_checkingAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int f_num =0;
		int e_num =0;
		c_loginDao dao = c_loginDao.getInstance();
		c_login client = new c_login();
		client.setC_id(request.getParameter("c_id"));
		client.setPwd(request.getParameter("pwd"));
		f_num = dao.select_c_login(client);
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/f_main/f_main.jsp");
		HttpSession session = request.getSession();
		session.setAttribute("f_num", f_num);
		return forward;
	}

}
