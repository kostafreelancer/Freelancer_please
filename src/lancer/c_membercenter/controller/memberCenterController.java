package lancer.c_membercenter.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.c_membercenter.action.Action;
import lancer.c_membercenter.action.ActionForward;
import lancer.c_membercenter.action.getFnameAction;


@WebServlet("*.mc")
public class memberCenterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public memberCenterController() {
        super();
       
    }

	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String requestURI= request.getRequestURI();
		System.out.println(requestURI+"aa");
		String contextPath = request.getContextPath();
		
		String command = requestURI.substring(contextPath.length()+1);
		System.out.println(command+"bb");
		
		
		ActionForward forward = null;
		Action action = null;
		
		
		if(command.equals("f_main/f_name.mc")){
			
			action = new getFnameAction();
			try {
				/*System.out.println(request.getParameter("f_name"+"cc"));*/
				forward = action.execute(request, response);
				/*System.out.println(request.getParameter("f_num") + "컨트롤");*/
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("bb");
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
