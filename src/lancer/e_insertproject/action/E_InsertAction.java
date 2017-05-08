package lancer.e_insertproject.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.c_login.model.c_login_enterprise;
import lancer.e_insertproject.model.E_Insert;
import lancer.e_insertproject.model.E_InsertDao;
import lancer.e_mypage.model.Enterprise;


public class E_InsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)throws Exception {
		request.setCharacterEncoding("utf-8");
		E_InsertDao dao = E_InsertDao.getInstance();
		E_Insert project = new E_Insert();
		
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
		project.setP_upperCost(Integer.parseInt(request.getParameter("p_upperCost")));
		project.setP_startDate(request.getParameter("p_startDate"));
		project.setP_endDate(request.getParameter("p_endDate"));
		
		String loc1 = request.getParameter("p_location1");
		String loc2 = request.getParameter("p_location2");
		project.setP_location(loc1 + "&" + loc2);

		project.setP_experience(Integer.parseInt(request.getParameter("p_experience")));
		
		dao.insertProject(project);
		
		String[] check = request.getParameterValues("check");
		for(int i=0;i<check.length;i++)
		{
			int job_id = Integer.parseInt(check[i]);
			dao.insertP_Job(job_id);
		}


		System.out.println(project);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Matching_Project/e_insertproject/e_finishproject.jsp"); //새로운 요청이므로 redirect 한다.
		
		return forward;
	}

}
