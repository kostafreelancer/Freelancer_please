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
		
		String[] e_mail = enterprise.getE_mail().split("@");
		request.setAttribute("e_mail_1", e_mail[0]);
		request.setAttribute("e_mail_2", e_mail[1]);
		
		String[] regno = enterprise.getE_regno().split("-");
		request.setAttribute("regno_1", regno[0]);
		request.setAttribute("regno_2", regno[1]);
		request.setAttribute("regno_3", regno[2]);
		
		String[] e_phone = enterprise.getE_phone().split("-");
		request.setAttribute("e_phone_1", regno[0]);
		request.setAttribute("e_phone_2", regno[1]);
		request.setAttribute("e_phone_3", regno[2]);
		
		String[] manager_hphone = enterprise.getManager_hphone().split("-");
		request.setAttribute("manager_hphone_1", manager_hphone[0]);
		request.setAttribute("manager_hphone_2", manager_hphone[1]);
		request.setAttribute("manager_hphone_3", manager_hphone[2]);
		
		String[] manager_mail = enterprise.getManager_mail().split("@");
		request.setAttribute("manager_mail_1", manager_mail[0]);
		request.setAttribute("manager_mail_2", manager_mail[1]);
	
		String[] e_address = enterprise.getE_address().split("&");
		request.setAttribute("e_address_1", e_address[0]);
		request.setAttribute("e_address_2", e_address[1]);
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/e_mypage/e_info.jsp");
		
		return forward;
	}

}
