package lancer.f_main.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.c_membercenter.action.ActionForward;
import lancer.f_main.action.getF_infoAction;
import lancer.f_main.action.mainAction;
import lancer.f_main.action.mainActionForward;

/**
 * Servlet implementation class f_main_controller
 */
@WebServlet("*.fm")
public class f_main_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public f_main_controller() {
        super();
        
    }

    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	String requestURI = request.getRequestURI();
    	System.out.println(request.getRequestURI() + "    URIaa");
    	String contextPath = request.getContextPath();
    	
    	String command = requestURI.substring(contextPath.length()+1);
    	System.out.println(command + "    aacommand");
    	
    
    	 
    	mainActionForward forward = null;
    	mainAction action = null;
    	
    	if(command.equals("f_main/f_main.fm")){
    		action = new getF_infoAction();
    		try {
				forward = action.execute(request, response);
				
				System.out.println(request.getAttribute("member") + "이름");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("실패?");
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
		System.out.println(forward + "   ffff");
		
	}
    	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
