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
import lancer.c_login.action.c_loginAction;
import lancer.c_login.action.c_login_checkingAction;
import lancer.c_login.action.c_logoutAction;



@WebServlet("*.c_login")
public class c_loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public c_loginController() {
        super();
       
    }

    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

        String requestURI = request.getRequestURI();
        System.out.println(requestURI+": requestURI"); 
      /*  String contextPath = request.getContextPath();
        System.out.println(contextPath+": contextPath");
        String command = requestURI.substring(contextPath.length() + 1); 
        ActionForward forward = null;
        Action action = null;
    	System.out.println(command+": command");
        String name[] = command.split("/");
        System.out.println(name.length);
        for(int i =0;i<name.length;i++){
        	System.out.println(name[i]+i+"번째 name");
        }*/
        ActionForward forward = null;
        Action action = null;
        String command[] = requestURI.split("/");
        if(command[command.length-1].equals("checking.c_login")){
        	action = new c_login_checkingAction();
        	try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	System.out.println(forward);
        }else if(command[command.length-1].equals("insert.c_login")){
        	action = new c_loginAction();
        	try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }else if(command[command.length-1].equals("remove_session.c_login")){
        	action = new c_logoutAction();
        	try{
        		forward = action.execute(request, response);
        	}catch (Exception e) {
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
