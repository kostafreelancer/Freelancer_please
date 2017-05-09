package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.FreelancerDao;
import lancer.f_mypage.model.School;

public class UpdateSchoolAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		School school = new School();
		school.setSchool_num(Integer.parseInt(request.getParameter("school_num")));
		school.setSchool_name(request.getParameter("school_name"));
		school.setMajor(request.getParameter("major"));
		school.setSchool_term(request.getParameter("term"));
		school.setSchool_location(request.getParameter("location"));
		FreelancerDao dao = FreelancerDao.getInstance();
		dao.updateSchool(school);

		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp");
		return forward;
	}

}
