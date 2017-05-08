package lancer.f_mypage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.Calendar;
import lancer.f_mypage.model.FreelancerDao;

public class ShowScheduleInfoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String num = request.getParameter("f_num");
		int f_num=1;
		if(num != null){
			f_num = Integer.parseInt(num);
		}
		
		FreelancerDao dao = FreelancerDao.getInstance();
		String proName = dao.getMyProjectName(f_num);
		List<Calendar> scheduleList = dao.getMySchedule(f_num);
		
		
		request.setAttribute("proName", proName);
		request.setAttribute("scheduleList", scheduleList);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/f_mypage/scheduleManager.jsp");
		
		return forward;

	}

}
