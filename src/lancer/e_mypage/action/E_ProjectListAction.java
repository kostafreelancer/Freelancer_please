package lancer.e_mypage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.e_mypage.model.Enterprise;
import lancer.e_mypage.model.Project;
import lancer.c_login.model.c_login_enterprise;
import lancer.e_mypage.model.E_MypageDao;



public class E_ProjectListAction implements E_MypageAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		c_login_enterprise enterprise = (c_login_enterprise)session.getAttribute("client");
		int e_num = enterprise.getE_num();
		
		E_MypageDao dao = E_MypageDao.getInstance();
		List<Project> readyList = dao.listProjectReady(e_num);
		List<Project> doingList = dao.listProjectDoing(e_num);
		List<Project> doneList = dao.listProjectDone(e_num);
		
		request.setAttribute("readyList", readyList);
		request.setAttribute("doingList", doingList);
		request.setAttribute("doneList", doneList);
		

		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/e_mypage/e_project.jsp");
		
		return forward;
	}

}
