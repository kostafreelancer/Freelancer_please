package lancer.f_mypage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.model.ApplyProject;
import lancer.f_mypage.model.Career;
import lancer.f_mypage.model.Certificate;
import lancer.f_mypage.model.Freelancer;
import lancer.f_mypage.model.FreelancerDao;
import lancer.f_mypage.model.School;

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
		List<School> school = dao.showSchoolInfo(f_num);
		List<Certificate> certificate = dao.showCertiInfo(f_num);
		List<ApplyProject> applyproject = dao.getApplyProject(f_num);


		if(career.size()==0){
			request.setAttribute("careercheck", "0");
		}else{
			request.setAttribute("career", career);
		}
		
		if(school.size()==0){
			request.setAttribute("schoolcheck", "0");
		}else{
			request.setAttribute("school", school);
		}
		
		if(certificate.size()==0){
			request.setAttribute("certificatecheck", "0");
		}else{
			request.setAttribute("certificate", certificate);
		}
		
		if(applyproject.size()==0){
			request.setAttribute("applyprojectcheck", "0");
		}else{
			request.setAttribute("applyproject", applyproject);
		}
		
		request.setAttribute("freelancer", freelancer);
		request.setAttribute("joblist", joblist);

		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/f_mypage/myInfo.jsp");
		
		return forward;
	}

}
