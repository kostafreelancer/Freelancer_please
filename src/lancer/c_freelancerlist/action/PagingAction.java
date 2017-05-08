package lancer.c_freelancerlist.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.c_freelancerlist.model.c_freelancerlistDao;
import lancer.c_freelancerlist.model.c_freelancerlist_total;

public class PagingAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		c_freelancerlistDao dao = c_freelancerlistDao.getInstance();
		List<c_freelancerlist_total> totallists = (List<c_freelancerlist_total>) request.getAttribute("totallists");
		
		
		
		return null;
	}
	
}
