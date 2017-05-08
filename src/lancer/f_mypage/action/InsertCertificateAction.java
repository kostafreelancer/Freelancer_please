package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.Certificate;
import lancer.f_mypage.model.FreelancerDao;

public class InsertCertificateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String num = request.getParameter("tempf_num");
		int f_num=1;
		if(num != null){
			f_num = Integer.parseInt(num);
		}
		FreelancerDao dao = FreelancerDao.getInstance();
		Certificate certificate = new Certificate();
		certificate.setCertificate_num(dao.getCertiNum()+1);
		certificate.setF_num(f_num);
		certificate.setCertificate_name(request.getParameter("certi_name"));
		certificate.setOrganization(request.getParameter("organization"));
		certificate.setAccept_date(request.getParameter("accept_date"));
		dao.insertCerti(certificate);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp");
		return forward;
	}
}
