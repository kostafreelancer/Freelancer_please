package lancer.e_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.e_mypage.model.Enterprise;
import lancer.c_login.model.c_login_enterprise;
import lancer.e_mypage.model.E_MypageDao;



public class E_InfoSelectAction implements E_MypageAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		c_login_enterprise enterprise = (c_login_enterprise)session.getAttribute("client");
		
		// 분리할 값들 분리
		String[] e_mail = enterprise.getE_mail().split("@");
		request.setAttribute("e_mail_1", e_mail[0]);
		request.setAttribute("e_mail_2", e_mail[1]);
		
		String[] regno = enterprise.getE_regno().split("-");
		request.setAttribute("regno_1", regno[0]);
		request.setAttribute("regno_2", regno[1]);
		request.setAttribute("regno_3", regno[2]);
		
		String[] e_phone = enterprise.getE_phone().split("-");
		request.setAttribute("e_phone_1", e_phone[0]);
		request.setAttribute("e_phone_2", e_phone[1]);
		request.setAttribute("e_phone_3", e_phone[2]);
		
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
		request.setAttribute("e_address_3", e_address[2]);
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/e_mypage/e_info.jsp");
		
		return forward;
	}

}
