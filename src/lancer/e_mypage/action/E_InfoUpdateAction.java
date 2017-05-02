package lancer.e_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.e_mypage.model.Enterprise;
import lancer.e_mypage.model.E_MypageDao;



public class E_InfoUpdateAction implements E_MypageAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		E_MypageDao dao = E_MypageDao.getInstance();
		
		
		
		
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("Matching_Project/e_mypage/e_project.jsp");
		
		return forward;
	}

}
