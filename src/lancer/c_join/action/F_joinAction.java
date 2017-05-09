package lancer.c_join.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.c_join.model.F_join;
import lancer.c_join.model.F_joinDAO;

public class F_joinAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		F_joinDAO dao = F_joinDAO.getInstance();
		F_join f_join = new F_join();
		
		//핸드폰
		String f_hphone1 = request.getParameter("f_hphone1");
		String f_hphone2 = request.getParameter("f_hphone2");
		String f_hphone3 = request.getParameter("f_hphone3");
		String f_hphone = f_hphone1 +"-"+ f_hphone2 +"-"+ f_hphone3;
		f_join.setF_hphone(f_hphone);
		
		//전화
		String f_phone1 = request.getParameter("f_phone1");
		String f_phone2 = request.getParameter("f_phone2");
		String f_phone3 = request.getParameter("f_phone3");
		String f_phone = f_phone1 +"-"+ f_phone2 +"-"+ f_phone3;
		f_join.setF_phone(f_phone);
		
		//이메일
		String f_email1 = request.getParameter("f_email1");
		String f_email2 = request.getParameter("f_email2");
		String f_email = f_email1+"@"+f_email2;
		f_join.setF_email(f_email);

		//주소
		String f_address1=request.getParameter("f_address1");
		String f_address2=request.getParameter("f_address2");
		String f_address3=request.getParameter("f_address3");
		String f_address=f_address1+"&"+f_address2+"&"+f_address3;
		f_join.setF_address(f_address);
		
		f_join.setF_birth(request.getParameter("f_birth"));
		f_join.setF_fname(request.getParameter("f_fname"));
		f_join.setF_id(request.getParameter("f_id"));
		f_join.setF_major(request.getParameter("f_major"));
		f_join.setF_name(request.getParameter("f_name"));
		f_join.setF_nowstate("활동중");
		f_join.setF_num(dao.getnum()+1);
		f_join.setF_pwd(request.getParameter("f_pwd"));
		f_join.setF_recentlogin("2017년");
		f_join.setF_score(0);
		f_join.setF_sex(request.getParameter("f_sex"));
		
		dao.insert_f_join(f_join);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/c_join/c_join_step4.jsp");
		return forward;
	}

}
