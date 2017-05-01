package lancer.c_membercenter.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.c_membercenter.model.memberCenter;
import lancer.c_membercenter.model.memberCenterDao;

public class getFnameAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name="이름";
		memberCenterDao cDao = memberCenterDao.getInstance();
		memberCenter mc = new memberCenter();
		
		mc.setF_name(request.getParameter("f_name"));
		name = cDao.f_name(mc);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/c_membercenter/member_centerMain.jsp");
		
		
		
		
		return forward;
	}

}
