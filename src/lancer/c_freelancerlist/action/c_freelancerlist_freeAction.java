package lancer.c_freelancerlist.action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.c_freelancerlist.model.c_freelancerlistDao;
import lancer.c_freelancerlist.model.c_freelancerlist_total;


public class c_freelancerlist_freeAction implements Action{

	@Override
	public lancer.c_freelancerlist.action.ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Calendar cal = Calendar.getInstance();
		c_freelancerlistDao dao = c_freelancerlistDao.getInstance();
		c_freelancerlist_total totallist = new c_freelancerlist_total();
		List<c_freelancerlist_total> totallists = new ArrayList<c_freelancerlist_total>();
		totallists = dao.select_freelancer_basic();
		/*System.out.println(totallists.get(0).getF_birth()+"여기 생일");
		System.out.println(cal.get(Calendar.YEAR));
		int age = cal.get(Calendar.YEAR)-Integer.parseInt(totallists.get(0).getF_birth().substring(0, 4))+1;
		System.out.println(age);*/
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/c_freelancerlist/f_list.jsp");
		HttpSession session = request.getSession();
		session.setAttribute("totallists", totallists);
		/*request.setAttribute("totallists", totallists);*/
		return forward;
	}
	
}
