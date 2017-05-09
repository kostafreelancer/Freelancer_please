package lancer.e_main.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.e_main.action.ActionForward;
import lancer.e_main.action.E_MainAction;
import lancer.e_main.action.E_MainCountAction;



@WebServlet("*.e_main")
public class E_MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public E_MainController() {
		super();
	}
	
	public void doProcess(HttpServletRequest request, HttpServletResponse response) {
		
		   String requestURI = request.getRequestURI();
	       String command[] = requestURI.split("/");
	       
	       E_MainAction action = null;
	       ActionForward forward = null;
		
		System.out.println(command[command.length-1]);
		if(command[command.length-1].equals("e_maincount.e_main")){
			action = new E_MainCountAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		if (forward != null) {
			try {
				if (forward.isRedirect()) { // redirect �떆�궎寃좊떎
					response.sendRedirect(forward.getPath());
				} else { // dispatch �떆�궎寃좊떎
					RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
					dispatcher.forward(request, response);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	
	
	
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
