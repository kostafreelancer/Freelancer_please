package lancer.c_join.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.c_join.model.E_join;
import lancer.c_join.model.E_joinDAO;

public class E_joinAction implements Action {

	@Override
	public ActionForword execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		E_joinDAO dao = E_joinDAO.getInstance();
		E_join e_join = new E_join();
		
		//회사이메일
		String email1 = request.getParameter("e_mail1");
		String email2 = request.getParameter("e_mail2");
		String e_email = email1+"@"+email2;
		e_join.setE_mail(e_email);
		System.out.println(e_join.getE_mail());
		
		//매니저이메일
		String managermail1 = request.getParameter("manager_mail1");
		String managermail2 = request.getParameter("manager_mail2");
		String manager_mail = managermail1+"@"+managermail2;
		e_join.setManager_mail(manager_mail);
		System.out.println(e_join.getManager_mail());
		
		//담당자 핸드폰번호
		String managerhphone1 = request.getParameter("manager_hphone1");
		String managerhphone2 = request.getParameter("manager_hphone2");
		String managerhphone3 = request.getParameter("manager_hphone3");
		String manager_hphone=managerhphone1+"-"+managerhphone2+"-"+managerhphone3;
		e_join.setManager_hphone(manager_hphone);
		System.out.println(e_join.getManager_hphone());
		
		//대표번호e_phone1
		String e_phone1 = request.getParameter("e_phone1");
		String e_phone2 = request.getParameter("e_phone2");
		String e_phone3 = request.getParameter("e_phone3");
		String e_phone=e_phone1+"-"+e_phone2+"-"+e_phone3;
		e_join.setE_phone(e_phone);
		System.out.println(e_join.getE_phone());
		
		//사업자번호
		String e_regno1 = request.getParameter("e_regno1");
		String e_regno2 = request.getParameter("e_regno2");
		String e_regno3 = request.getParameter("e_regno3");
		String e_regno=e_regno1+"-"+e_regno2+"-"+e_regno3;
		e_join.setE_regno(e_regno);
		System.out.println(e_join.getE_regno());
		
		//주소
		String address1=request.getParameter("address1");
		String address2=request.getParameter("address2");
		String address3=request.getParameter("address3");
		String e_address=address1+" "+address2+" "+address3;
		e_join.setE_address(e_address);
		System.out.println(e_join.getE_address());
		
		e_join.setManager_name(request.getParameter("manager_name"));
		e_join.setE_bf(request.getParameter("e_bf"));
		e_join.setE_capital(Integer.parseInt(request.getParameter("e_capital")));
		//e_join.setE_check(request.getParameter("e_check"));
		e_join.setE_check("0");
		e_join.setE_ename(request.getParameter("e_ename"));
		e_join.setE_enum(Integer.parseInt(request.getParameter("e_enum")));
		e_join.setE_homepage(request.getParameter("e_homepage"));
		e_join.setE_id(request.getParameter("e_id"));
		//e_join.setE_licensefile(request.getParameter("e_licensefile"));
		e_join.setE_licensefile("jj");
		e_join.setE_score(0);
		e_join.setE_listing(request.getParameter("e_listing"));
		e_join.setE_name(request.getParameter("e_name"));
		e_join.setE_num(dao.getnum()+1);
		e_join.setE_owner(request.getParameter("e_owner"));
		e_join.setE_ownerfile(request.getParameter("e_ownerfile"));
		e_join.setE_pwd(request.getParameter("e_pwd"));
		e_join.setE_sales(Integer.parseInt(request.getParameter("e_sales")));
		e_join.setE_scale(request.getParameter("e_scale"));
		e_join.setStart_year(Integer.parseInt(request.getParameter("start_year")));
		
		System.out.println(e_join.getE_id());
		System.out.println(e_join.getE_num());
		
		dao.insert_e_join(e_join);

		ActionForword forward = new ActionForword();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/c_join/c_join_step4.jsp");
		
		return forward;
	}

}
