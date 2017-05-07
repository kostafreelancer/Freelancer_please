package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.Career;
import lancer.f_mypage.model.FreelancerDao;

public class UpdateCareerAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Career career = new Career();
		career.setCareer_num(Integer.parseInt(request.getParameter("career_num")));
		career.setCompany(request.getParameter("company"));
		career.setDept(request.getParameter("dept"));
		career.setRank(request.getParameter("rank"));
		career.setTerm(request.getParameter("term"));
		career.setLocation(request.getParameter("location"));
		FreelancerDao dao = FreelancerDao.getInstance();
		dao.updateCareer(career);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp");
		return forward;
	}

}
