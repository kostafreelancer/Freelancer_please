package lancer.e_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.e_mypage.model.Enterprise;
import lancer.e_mypage.model.E_MypageDao;



public class E_MypageSelectAction implements E_MypageAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
 		String num = request.getParameter("e_num");
		int e_num = -1;
		if(num != null){
			e_num = Integer.parseInt(num);
		}
		
		e_num = 1;
		
		E_MypageDao dao = E_MypageDao.getInstance();
		Enterprise enterprise = dao.selectEnterprise(e_num);
		
		System.out.println(enterprise);
		
		request.setCharacterEncoding("utf-8");
		request.setAttribute("enterprise", enterprise);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/e_mypage/e_info.jsp");
		
		return forward;
	}

}
