package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.Freelancer;
import lancer.f_mypage.model.FreelancerDao;

public class ShowFreelancerInfoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String num = request.getParameter("f_num");
		int f_num=1;
		if(num != null){
			f_num = Integer.parseInt(num);
		}
		FreelancerDao dao = FreelancerDao.getInstance();
		Freelancer freelancer = dao.showFreelancerInfo(f_num);
		request.setAttribute("freelancer", freelancer);
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/f_mypage/myInfo.jsp");
		
		return forward;
	}

}
