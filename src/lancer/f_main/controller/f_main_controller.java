package lancer.f_main.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_main.action.countFreelancerAction;
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
    	/*System.out.println(requestURI + "    URIaa");
    	String contextPath = request.getContextPath();
    	System.out.println(contextPath + "   conpath");
    	String command = requestURI.substring(contextPath.length()+1);
    	System.out.println(command + "    aacommand");*/
    	String command[] = requestURI.split("/");
    
    	 
    	mainActionForward forward = null;
    	mainAction action = null;
    	mainAction action2 = null;
    	if(command[command.length-1].equals("f_main.fm")){
    		action = new getF_infoAction();
    		action2 = new countFreelancerAction();
    		try {
				forward = action.execute(request, response);
				forward = action2.execute(request, response);
				System.out.println(request.getAttribute("count") + "移댁슫�듃");
				System.out.println(request.getAttribute("member1") + "�씠由� 硫ㅻ쾭");
				
			
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("�떎�뙣?");
			}
    	}
    	
    	
    	
		if(forward != null){
			if(forward.isRedirect()){
				/*if(forward.getPath().equals("lancer.f_main.action.mainActionForward")){
					mainActionForward af = new mainActionForward();
					af.setPath(null);
				}*/
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
