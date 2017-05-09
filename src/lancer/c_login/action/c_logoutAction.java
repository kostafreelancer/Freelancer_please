package lancer.c_login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.c_login.model.checking_identity;

public class c_logoutAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		ActionForward forward = new ActionForward();
		checking_identity identity;
		System.out.println(session.getAttribute("identity")+"이건강");
		if(session.getAttribute("identity")!=null){
			identity = (checking_identity) session.getAttribute("identity");
			System.out.println(identity.getIdentity()+"이거라며!! ");
			if(identity.getIdentity().equals("no")){
				System.out.println("그럼 여기 드와야지 ");
				forward.setRedirect(true);
				forward.setPath("/Matching_Project/c_login/login.jsp");
			}else{
				session.invalidate();
				forward.setRedirect(true);
				forward.setPath("f_main.fm");
			}
		}else{
			forward.setRedirect(true);
			forward.setPath("/Matching_Project/c_login/login.jsp");
		}
		return forward;
	}

}
