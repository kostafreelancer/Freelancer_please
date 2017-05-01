package lancer.e_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.e_mypage.model.Enterprise;
import lancer.e_mypage.model.EnterpriseDao;



public class E_MypageSelectAction implements E_MypageAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("execute 1");
		// String num = request.getParameter("e_num");
		String num = "1";
		int e_num = 1;
		if(num != null){
			e_num = Integer.parseInt(num);
		}
		System.out.println("execute 2");
		
		EnterpriseDao dao = EnterpriseDao.getInstance();
		System.out.println("execute 3");
		Enterprise enterprise = dao.selectEnterprise(e_num);
		
		
		request.setCharacterEncoding("utf-8");
		request.setAttribute("enterprise", enterprise);
		System.out.println("execute 4");
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("e_mypage/e_info.jsp");
		
		System.out.println(forward.getPath());
		System.out.println("execute 5");
		
		return forward;
	}

}
