package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.FreelancerDao;

public class DeleteCertificateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String num = request.getParameter("deleteCerti_num");
		FreelancerDao dao = FreelancerDao.getInstance();
		dao.deleteCerti(Integer.parseInt(num));
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp");
		return forward;
	}

}
