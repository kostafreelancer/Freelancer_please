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
		
		String[] values = freelancer.getF_phone().split("-");
		for(int i=0;i<values.length; i++){
			System.out.println(values[i]);
		}
		request.setAttribute("freelancer", freelancer);
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/f_mypage/myInfo.jsp");
		
		return forward;
	}

}
