package lancer.c_membercenter.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import lancer.c_membercenter.model.memberCenter;
import lancer.c_membercenter.model.memberCenterDao;

public class getFnameAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		int f_num = (int) session.getAttribute("f_num");
		int seq = 1;
		if(session.getAttribute("f_num") != null){
			
			System.out.println(f_num + " 번회원");
		}
		String f_name="";
		/*int seq = 1;
		if(f_num != null){
			seq = Integer.parseInt(f_num);
			System.out.println("변환됐냐");
		}else{
			System.out.println("안들어왓음");
		}*/
		memberCenterDao cDao = memberCenterDao.getInstance();
		memberCenter mc = cDao.getFname(f_num);
		System.out.println(mc + "엠씨");
		/*mc.setF_name(f_name);*/
		/*request.setAttribute("f_name", f_name);*/
		session.setAttribute("f_name", mc.getF_name());
		session.setAttribute("f_email", mc.getF_email());
		session.setAttribute("f_phone", mc.getF_hPhone());
		/*mc.setF_name(request.getParameter("f_name"));*/
		
		System.out.println(mc.getF_name() + "이름!!!!!!!!!!!");
		System.out.println(mc.getF_email() + "이메이@@@@@@@@@@@@");
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/c_membercenter/member_centerMain.jsp");
		
	/*	HttpSession session2 = request.getSession();
		session2.setAttribute("f_name", f_name);*/
		
		
		
		return forward;
	}

}
