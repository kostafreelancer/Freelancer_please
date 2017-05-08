package lancer.e_mypage.action;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lancer.e_mypage.model.Enterprise;
import lancer.e_mypage.model.Project;
import lancer.c_login.model.c_login_enterprise;
import lancer.e_mypage.model.E_MypageDao;



public class E_ProjectSelectAction implements E_MypageAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		c_login_enterprise enterprise = (c_login_enterprise)session.getAttribute("client");
		
		// 기업 정보 구하기
		String[] manager_hphone = enterprise.getManager_hphone().split("-");
		request.setAttribute("manager_hphone_1", manager_hphone[0]);
		request.setAttribute("manager_hphone_2", manager_hphone[1]);
		request.setAttribute("manager_hphone_3", manager_hphone[2]);
		
		String[] manager_mail = enterprise.getManager_mail().split("@");
		request.setAttribute("manager_mail_1", manager_mail[0]);
		request.setAttribute("manager_mail_2", manager_mail[1]);
		

		// 프로젝트 정보 구하기
		
		int e_num = enterprise.getE_num();
		int e_pr_num = Integer.parseInt(request.getParameter("e_pr_num"));

		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("e_num", e_num);
		map.put("e_pr_num", e_pr_num);
		
		E_MypageDao dao = E_MypageDao.getInstance();
		Project project = dao.selectProject(map);
		
		request.setAttribute("project", project);
		
		//상세분야 구하기
		List<Integer> p_job = dao.selectP_job(e_pr_num);
		request.setAttribute("p_job", p_job);
		
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/e_mypage/e_projectInfo.jsp");
		
		return forward;
	}

}
