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
		e_join.setE_address(request.getParameter("e_adress"));
		e_join.setE_bf(request.getParameter("e_bf"));
		e_join.setE_capital(Integer.parseInt(request.getParameter("e_capital")));
		e_join.setE_check(request.getParameter("e_check"));
		e_join.setE_ename(request.getParameter("e_ename"));
		e_join.setE_enum(Integer.parseInt(request.getParameter("e_enum")));
		e_join.setE_homepage(request.getParameter("e_homepage"));
		e_join.setE_id(request.getParameter("e_id"));
		e_join.setE_licensefile(request.getParameter("e_licensefile"));
		e_join.setE_listing(request.getParameter("e_listing"));
		e_join.setE_mail(request.getParameter("e_email"));
		e_join.setE_name(request.getParameter("e_name"));
		e_join.setE_num(Integer.parseInt(request.getParameter("e_num")));
		e_join.setE_owner(request.getParameter("e_owner"));
		e_join.setE_ownerfile(request.getParameter("ownerfile"));
		e_join.setE_phone(request.getParameter("e_phone"));
		e_join.setE_pwd(request.getParameter("e_pwd"));
		e_join.setE_regno(request.getParameter("e_regno"));
		e_join.setE_sales(Integer.parseInt(request.getParameter("e_sales")));
		e_join.setE_scale(request.getParameter("e_scale"));
		
		dao.insert_e_join(e_join);
		
		ActionForword forward = new ActionForword();
		forward.setRedirect(true);
		forward.setPath("/c_join_step4.jsp");
		
		return forward;
	}

}
