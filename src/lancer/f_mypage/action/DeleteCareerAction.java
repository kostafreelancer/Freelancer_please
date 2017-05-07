package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.FreelancerDao;

public class DeleteCareerAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String num = request.getParameter("deleteCareer_num");
		FreelancerDao dao = FreelancerDao.getInstance();
		dao.deleteCareer(Integer.parseInt(num));
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp");
		return forward;
	}

}
