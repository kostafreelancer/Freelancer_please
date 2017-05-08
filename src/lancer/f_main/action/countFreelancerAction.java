package lancer.f_main.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_main.model.member;
import lancer.f_main.model.memberDao;

public class countFreelancerAction implements mainAction {

	@Override
	public mainActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		memberDao dao = memberDao.getInstance();
		
		String path = "/f_main/f_main.jsp";
		int countFreelancer = dao.countfreelancer();
		System.out.println(countFreelancer + "몇명?");
		
		request.setAttribute("count", countFreelancer);
		
		mainActionForward actionForward = new mainActionForward();
		actionForward.setRedirect(false);
		actionForward.setPath(path);
		return actionForward;
	}

}
