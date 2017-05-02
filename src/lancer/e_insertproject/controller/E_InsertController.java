package lancer.e_insertproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import lancer.e_insertproject.action.E_InsertAction;
import lancer.e_insertproject.action.E_InsertFormAction;


@WebServlet("*.e_insertproject")
public class E_InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public E_InsertController() {
        super();
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	//요청하는 url을 식별해야 한다.
    	String requestURI = request.getRequestURI();
    	//System.out.println(requestURI); // /MVC_project: context이다/insert.do가 출력됨
    	String contextPath = request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+1);
    	System.out.println(command); // insert.do만 출력됨
    	
    	lancer.e_insertproject.action.ActionForward forward = null;
    	lancer.e_insertproject.action.Action action = null;
    	
    	if(command.equals("insertForm.e_insertproject")){
    		action = new E_InsertFormAction();
    		try {
    			forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("insertAction.e_insertproject")){
    		action = new E_InsertAction();
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
