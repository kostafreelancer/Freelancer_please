package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.Certificate;
import lancer.f_mypage.model.FreelancerDao;

public class UpdateCertificateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Certificate certificate = new Certificate();
		certificate.setCertificate_num(Integer.parseInt(request.getParameter("certi_num")));
		certificate.setCertificate_name(request.getParameter("certi_name"));
		certificate.setOrganization(request.getParameter("organization"));
		certificate.setAccept_date(request.getParameter("accept_date"));
		
		FreelancerDao dao = FreelancerDao.getInstance();
		dao.updateCerti(certificate);
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp");
		return forward;
	}

}
