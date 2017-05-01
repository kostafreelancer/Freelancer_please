package lancer.c_login.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.c_login.action.Action;
import lancer.c_login.action.ActionForward;
import lancer.c_login.action.c_login_checkingAction;



@WebServlet("*.c_login")
public class c_loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public c_loginController() {
        super();
       
    }

    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    	

    
        String requestURI = request.getRequestURI();
        // System.out.println(requestURI); /MVC_project/insert.do 
        String contextPath = request.getContextPath();
        String command = requestURI.substring(contextPath.length() + 1); // +1��
        ActionForward forward = null;
        Action action = null;
    	
        
        if(command.equals("c_login/checking.c_login")){
        	action = new c_login_checkingAction();
        	
        	try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	System.out.println(forward);
        }else if(command.equals("c_login/insert.c_login")){
        	
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
