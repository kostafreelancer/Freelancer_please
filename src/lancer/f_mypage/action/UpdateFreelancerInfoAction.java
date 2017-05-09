package lancer.f_mypage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.f_mypage.model.F_job;
import lancer.f_mypage.model.Freelancer;
import lancer.f_mypage.model.FreelancerDao;

public class UpdateFreelancerInfoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		FreelancerDao dao = FreelancerDao.getInstance();
		ActionForward forward = new ActionForward();
		
		String num = request.getParameter("f_num");
		int f_num=1;
		if(num != null){
			f_num = Integer.parseInt(num);
		}
		String my_pwd = dao.getFreelancerPassword(f_num);
		HttpSession session = request.getSession();
		if(!request.getParameter("f_pwd").equals(my_pwd)){
			session.setAttribute("pwd_error", "error");
			forward.setRedirect(true);
			forward.setPath("showFreelancerInfo.f_mypage?f_num="+ f_num);
			return forward;
		}else{
			session.removeAttribute("pwd_error");
			Freelancer freelancer = new Freelancer();
			freelancer.setF_num(f_num);
			System.out.println(request.getParameter("f_pwd"));
			System.out.println(request.getParameter("f_name"));
			System.out.println(request.getParameter("f_birth"));
		
			
			freelancer.setF_pwd(request.getParameter("f_pwd"));
			freelancer.setF_name(request.getParameter("f_name"));
			freelancer.setF_birth(request.getParameter("f_birth"));
			String f_sex;
		
			if(request.getParameter("f_sex").equals("1")){
				f_sex = "³²";
			}else{
				f_sex = "¿©";
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
			
			
			int re = dao.updateFreelancerInfo(freelancer);
			
			String checkArr[] = request.getParameterValues("fm_new_keyword[]");
			dao.deleteFreelancerJobInfo(f_num);
			int total=0;
			for(int i=0; i<checkArr.length; i++){
				total += dao.insertFreelancerJobInfo(new F_job(f_num, Integer.parseInt(checkArr[i])));
			}
			

			if(re>0 && total==checkArr.length){
				forward.setRedirect(true);
				forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp");
			}else{
				forward.setRedirect(true);
				forward.setPath("/Matching_Project/f_mypage/updateSuccess.jsp?f_num="+freelancer.getF_num());
			}
			return forward;
		}
		
		
	}

}
