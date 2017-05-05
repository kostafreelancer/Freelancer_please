package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.Freelancer;
import lancer.f_mypage.model.FreelancerDao;

public class UpdateFreelancerInfoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Freelancer freelancer = new Freelancer();
		System.out.println(request.getParameter("f_num"));
		freelancer.setF_num(Integer.parseInt(request.getParameter("f_num")));
		System.out.println(request.getParameter("f_pwd"));
		System.out.println(request.getParameter("f_name"));
		System.out.println(request.getParameter("f_birth"));
	
		
		freelancer.setF_pwd(request.getParameter("f_pwd"));
		freelancer.setF_name(request.getParameter("f_name"));
		freelancer.setF_birth(request.getParameter("f_birth"));
		String f_sex;
		if(request.getParameter("f_sex")=="1"){
			f_sex = "남";
		}else{
			f_sex = "여";
		}
		freelancer.setF_sex(f_sex);
		String f_hphone = request.getParameter("fm_phone1") + "-" + request.getParameter("fm_phone2") + "-" + request.getParameter("fm_phone3"); 
		freelancer.setF_hphone(f_hphone);
		String f_phone = request.getParameter("fm_tel1") + "-" + request.getParameter("fm_tel2") + "-" + request.getParameter("fm_tel3"); 
		freelancer.setF_phone(f_phone);
		String f_email = request.getParameter("fm_email11") + "@" + request.getParameter("fm_email12");
		freelancer.setF_email(f_email);
		String f_address = request.getParameter("fm_zip") + "&" + request.getParameter("fm_address") + "&" + request.getParameter("fm_address_etc");
		freelancer.setF_address(f_address);
		freelancer.setF_fname(request.getParameter("f_fname"));
		
		FreelancerDao dao = FreelancerDao.getInstance();
		int re = dao.updateFreelancerInfo(freelancer);
		ActionForward forward = new ActionForward();
		if(re>0){
			forward.setRedirect(true);
			forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp");
		}else{
			forward.setRedirect(true);
			forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp?f_num="+freelancer.getF_num());
		}
		return forward;
	}

}
