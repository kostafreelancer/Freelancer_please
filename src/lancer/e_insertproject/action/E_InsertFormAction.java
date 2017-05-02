package lancer.e_insertproject.action;

	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.c_login.model.c_login_enterprise;

	public class E_InsertFormAction implements Action {

		@Override
		public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
			HttpSession session = request.getSession();
			
			c_login_enterprise enterprise = (c_login_enterprise)session.getAttribute("client");
			
			String[] manager_hphone = enterprise.getManager_hphone().split("-");
			request.setAttribute("manager_hphone_1", manager_hphone[0]);
			request.setAttribute("manager_hphone_2", manager_hphone[1]);
			request.setAttribute("manager_hphone_3", manager_hphone[2]);
			
			String[] manager_mail = enterprise.getManager_mail().split("@");
			request.setAttribute("manager_mail_1", manager_mail[0]);
			request.setAttribute("manager_mail_2", manager_mail[1]);
			
			
			ActionForward forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/e_insertproject/e_insertproject.jsp");
			
			return forward;
		}

	}



