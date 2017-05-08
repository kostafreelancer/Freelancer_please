package lancer.f_mypage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.Career;
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
		
		String[] ph = freelancer.getF_phone().split("-");
		for(int i=0;i<ph.length; i++){
			request.setAttribute("ph"+(i+1), ph[i]);
		}
		String[] hph = freelancer.getF_hphone().split("-");
		for(int i=0;i<hph.length; i++){
			request.setAttribute("hph"+(i+1), hph[i]);
		}
		String[] email = freelancer.getF_email().split("@");
		for(int i=0; i<email.length; i++){
			request.setAttribute("email" + (i+1), email[i]);
		}
		String[] address = freelancer.getF_address().split("&");
		for(int i=0; i<address.length; i++){
			request.setAttribute("address" + (i+1), address[i]);
		}
		
		List<Integer> joblist = dao.showFreelancerJobInfo(f_num);
		List<Career> career = dao.showCareerInfo(f_num);
		
		request.setAttribute("freelancer", freelancer);
		request.setAttribute("joblist", joblist);
		request.setAttribute("career", career);
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/f_mypage/myInfo.jsp");
		
		return forward;
	}

}
