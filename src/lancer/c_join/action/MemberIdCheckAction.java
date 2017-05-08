package lancer.c_join.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.c_join.model.E_joinDAO;

public class MemberIdCheckAction implements Action {

	@Override
	public ActionForword execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 	String id = request.getParameter("userId");
		 	E_joinDAO dao = E_joinDAO.getInstance();
	        
	       List<String> list = dao.getAllId();
	       int check = 0;
	       for(int i=0; i<list.size(); i++){
	    	   if(list.get(i).equals(id)){
	    		   check++;
	    		   break;
	    	   }
	       }
	       request.setAttribute("check", check);
	       System.out.println(check);
	       ActionForword forword = new ActionForword();
	       forword.setRedirect(false);
	       forword.setPath("/e_join/e_join_step3.jsp");
	       


		return forword;
	}

}
