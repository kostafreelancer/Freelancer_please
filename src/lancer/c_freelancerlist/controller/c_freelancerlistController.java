package lancer.c_freelancerlist.controller;

import java.io.IOException;
import java.rmi.server.SocketSecurityException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.c_freelancerlist.action.Action;
import lancer.c_freelancerlist.action.ActionForward;
import lancer.c_freelancerlist.action.c_freelancerlist_freeAction;
import lancer.c_freelancerlist.model.c_freelancerlist_pading;


@WebServlet("*.f_list")
public class c_freelancerlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
    public c_freelancerlistController() {
        super();
       
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	
    	String requestURI = request.getRequestURI();
    	String command[] = requestURI.split("/");
    	Action action = null;
    	ActionForward forward = null;
    	if(command[command.length-1].equals("freelist.f_list")){
    		action = new c_freelancerlist_freeAction();
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
		
		doProcess(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request,response);
	}

}
