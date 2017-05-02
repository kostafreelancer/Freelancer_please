package lancer.f_mypage.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.action.Action;
import lancer.f_mypage.action.ActionForward;
import lancer.f_mypage.action.ShowFreelancerInfoAction;



@WebServlet("*.f_mypage")
public class kwangsikController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public kwangsikController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	String requestURI = request.getRequestURI();

    	String contextPath = request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+1);
    	ActionForward forward = null;
    	Action action = null;
    	System.out.println(command);
    	if(command.equals("f_mypage/showFreelancerInfo.f_mypage")){

    		action = new ShowFreelancerInfoAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    
    	}
    	
    	if(forward != null){
    		if(forward.isRedirect()){
    			response.sendRedirect(forward.getPath());
    		}else{
    			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request, response);
    		}
    	}
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	
	}

}
