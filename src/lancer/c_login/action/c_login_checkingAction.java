package lancer.c_login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.c_login.model.c_login;
import lancer.c_login.model.c_loginDao;

public class c_login_checkingAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = "안드왔네 쓰벌";
		c_loginDao dao = c_loginDao.getInstance();
		c_login client = new c_login();
		client.setC_id(request.getParameter("c_id"));
		client.setPwd(request.getParameter("pwd"));
		name = dao.select_c_login(client);
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		/*forward.setPath("/f_main/f_main.jsp");*/
		forward.setPath("/Matching_Project/f_main/f_main.jsp");
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		return forward;
	}

}
