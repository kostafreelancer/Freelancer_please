package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.FreelancerDao;
import lancer.f_mypage.model.School;

public class InsertSchoolAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String num = request.getParameter("tempf_num");
		int f_num=1;
		if(num != null){
			f_num = Integer.parseInt(num);
		}
		FreelancerDao dao = FreelancerDao.getInstance();
		School school = new School();
		school.setSchool_num(dao.getSchoolNum()+1);
		school.setF_num(f_num);
		school.setSchool_name(request.getParameter("school_name"));
		school.setMajor(request.getParameter("major"));
		school.setSchool_term(request.getParameter("term"));
		school.setSchool_location(request.getParameter("location"));
		dao.insertSchool(school);
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp");
		return forward;
	}

}
