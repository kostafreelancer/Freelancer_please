package lancer.e_insertproject.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.e_insertproject.model.E_Insert;
import lancer.e_insertproject.model.E_InsertDao;


public class E_InsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)throws Exception {
		E_InsertDao dao = E_InsertDao.getInstance();
		E_Insert project = new E_Insert();
		request.setCharacterEncoding("utf-8");

		
		project.setE_pr_num(Integer.parseInt(request.getParameter("e_pr_num")));
		project.setE_num(Integer.parseInt(request.getParameter("e_num")));
		project.setP_name(request.getParameter("p_name"));
		project.setP_content(request.getParameter("p_content"));
		project.setP_lowerAge(Integer.parseInt(request.getParameter("p_lowerAge")));
		project.setP_upperAge(Integer.parseInt(request.getParameter("p_upperAge")));
		project.setP_academic(request.getParameter("p_academic"));
		project.setP_requireNum(Integer.parseInt(request.getParameter("p_requireNum")));
		project.setP_regDate(request.getParameter("p_regDate"));
		project.setP_exDate(request.getParameter("p_exDate"));
		project.setP_lowerCost(Integer.parseInt(request.getParameter("p_lowerCost")));
		project.setP_upperAge(Integer.parseInt(request.getParameter("p_upperCost")));
		project.setP_startDate(request.getParameter("p_startDate"));
		project.setP_endDate(request.getParameter("p_endDate"));
		project.setP_location(request.getParameter("p_location"));
		project.setP_experience(Integer.parseInt(request.getParameter("p_experience")));
		
	
		dao.insertProject(project);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("listAction.do"); //새로운 요청이므로 redirect 한다.
		
		return forward;
	}

}
