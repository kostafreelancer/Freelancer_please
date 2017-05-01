package lancer.e_insertproject.action;

	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class E_InsertFormAction implements Action {

		@Override
		public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
			ActionForward forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/e_insertproject.jsp");
			
			return forward;
		}

	}



