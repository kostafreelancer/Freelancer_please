package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.Career;
import lancer.f_mypage.model.FreelancerDao;

public class InsertCareerAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String num = request.getParameter("tempf_num");
		int f_num=1;
		if(num != null){
			f_num = Integer.parseInt(num);
		}
		
		Career career = new Career();
		FreelancerDao dao = FreelancerDao.getInstance();
		career.setCareer_num(dao.getCareerNum()+1);
		career.setF_num(f_num);
		career.setCompany(request.getParameter("company"));
		career.setDept(request.getParameter("dept"));
		career.setRank(request.getParameter("rank"));
		career.setCareer_term(request.getParameter("term"));
		career.setCareer_location(request.getParameter("location"));
		dao.insertCareer(career);
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp");
		return forward;
	}

}
