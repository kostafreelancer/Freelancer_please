package lancer.f_main.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.c_membercenter.action.ActionForward;
import lancer.f_main.model.memberDao;

public class countProjectAction implements mainAction {

	@Override
	public mainActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		memberDao dao = memberDao.getInstance();
		
		String path = "/f_main/f_main.jsp";
		int countProject = dao.countProject();
		System.out.println("등록된 프로젝트의 수 = " + countProject);
		
		request.setAttribute("count_p", countProject);
		
		mainActionForward actionForward = new mainActionForward();
		actionForward.setRedirect(false);
		actionForward.setPath(path);
		
		return actionForward;
	}

}
