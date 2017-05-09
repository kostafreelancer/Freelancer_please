package lancer.e_main.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.e_mypage.model.Enterprise;
import lancer.c_login.model.c_login_enterprise;
import lancer.e_main.model.E_MainDao;
import lancer.e_mypage.model.E_MypageDao;



public class E_MainCountAction implements E_MainAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		E_MainDao dao = E_MainDao.getInstance();
		
		int fnumber = dao.countFreelancer();
		int pnumber = dao.countProject();
		
		request.setAttribute("fnumber", fnumber);
		request.setAttribute("pnumber", pnumber);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/e_main/e_main.jsp");
		
		return forward;
	}

}
