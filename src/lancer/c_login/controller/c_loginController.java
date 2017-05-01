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
    	
    	  // 겟과 포스트 따로 해주기 귀찮으니 하나로 모으자!!
        // 1.url식별
        String requestURI = request.getRequestURI();
        // System.out.println(requestURI); /MVC_project/insert.do 이런식으로 uri가 온다
        String contextPath = request.getContextPath();
        String command = requestURI.substring(contextPath.length() + 1); // +1은
     //   System.out.println(command); // 내가 원하는 uri만 insert.do 요롷게 나온다 ~~
        ActionForward forward = null;
        Action action = null;
    	
        
        if(command.equals("c_login/checking.c_login")){
        	action = new c_login_checkingAction();
        	
        	try {
        		System.out.println(request.getParameter("c_id"));
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	System.out.println(forward);
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
