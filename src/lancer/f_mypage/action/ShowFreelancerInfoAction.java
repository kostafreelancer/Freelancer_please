package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.Freelancer;
import lancer.f_mypage.model.FreelancerDao;

public class ShowFreelancerInfoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//이 부분 나중에 세션으로 바꿔야 될 수도?
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
		
		
		request.setAttribute("freelancer", freelancer);
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/f_mypage/myInfo.jsp");
		
		return forward;
	}

}
