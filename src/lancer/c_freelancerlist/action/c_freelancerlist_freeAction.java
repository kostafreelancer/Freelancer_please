package lancer.c_freelancerlist.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.c_freelancerlist.model.c_freelancerlistDao;
import lancer.c_freelancerlist.model.c_freelancerlist_total;


public class c_freelancerlist_freeAction implements Action{

	@Override
	public lancer.c_freelancerlist.action.ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		c_freelancerlistDao dao = c_freelancerlistDao.getInstance();
		c_freelancerlist_total totallist = new c_freelancerlist_total();
		totallist = dao.select_freelancer_basic();
		/*String f_name = dao.c_freelancer_list();*/
		System.out.println(totallist.getF_name());
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/c_freelancerlist/f_list.jsp");
		
		return forward;
	}
	
}
