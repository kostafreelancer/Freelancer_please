package lancer.f_main.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.f_main.model.member;
import lancer.f_main.model.memberDao;

public class getF_infoAction implements mainAction {

	@Override
	public mainActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*HttpSession session = request.getSession();*/
		member m = new member();
		memberDao dao = memberDao.getInstance();
		List<member> member = dao.getF_info();
		System.out.println(member.size() + "사이즈");
		/*List<String> test = new ArrayList<String>();*/
		for(int i=0; i<member.size(); i++){
			System.out.println("member = " + member.get(i).f_name);
			request.setAttribute("member" + i , member.get(i).f_name);
		}
	/*	request.setAttribute("member",member.get(1).f_name);
		System.out.println(request.getAttribute("member")+ "누구야");*/
		
		/*request.setAttribute("member", member);*/
		/*session.setAttribute("member", member);*/
		/*session.setAttribute("member_name", meme);*/
	/*	session.setAttribute("f_name", member.getF_name());*/
		
		
		mainActionForward ActionForward = new mainActionForward();
		ActionForward.setRedirect(false);
		ActionForward.setPath("/f_main/f_main.jsp");
		
		return ActionForward;
	}

}
