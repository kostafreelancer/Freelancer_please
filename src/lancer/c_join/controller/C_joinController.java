package lancer.c_join.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.c_join.action.Action;
import lancer.c_join.action.ActionForword;
import lancer.c_join.action.E_joinAction;
import lancer.c_join.action.E_joinActionForm;
import lancer.c_join.action.MemberIdCheckAction;



@WebServlet("*.e_join")
public class C_joinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public C_joinController(){
		 super();
	 }
	 
	    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	    	String requestURI = request.getRequestURI();
	    	String contextPath = request.getContextPath();
	    	String command[] = requestURI.split("/");
	    	System.out.println(command);
	    	
	    	ActionForword forward=null;
	    	Action action=null;
	    	
	    	if(command[command.length-1].equals("e_joinAction.e_join")){
	    		action=new E_joinAction();
	    		
	    		try{
	    		forward =action.execute(request, response);
	    		}catch (Exception e) {
					e.printStackTrace();
				}
	    	}else if(command[command.length-1].equals("e_joinActionForm.e_join")){
	    		action = new E_joinAction();
	    		try {
					forward = action.execute(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
	    	}else if(command[command.length-1].equals("e_memberIdCheck.e_join")){
	    		action = new MemberIdCheckAction();
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
