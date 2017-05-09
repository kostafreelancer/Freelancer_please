package lancer.e_mypage.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.e_mypage.action.ActionForward;
import lancer.e_mypage.action.E_MypageAction;
import lancer.e_mypage.action.E_ProjectListAction;
import lancer.e_mypage.action.E_ProjectSelectAction;
import lancer.e_mypage.action.E_InfoSelectAction;
import lancer.e_mypage.action.E_InfoUpdateAction;


@WebServlet("*.e_mypage")
public class E_MypageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public E_MypageController() {
		super();
	}
	
	public void doProcess(HttpServletRequest request, HttpServletResponse response) {
		// 내가 만든 메소드, get으로 요청하든 post로 요청하든 수행하게 해줌
		
		/*String requestURI = request.getRequestURI();
		// requestURI = "MVC_Project/insert.do"
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 1);
		// command = "insert.do"
		System.out.println(command);
		ActionForward forward = null;
		E_MypageAction action = null;*/
		
		   String requestURI = request.getRequestURI();
	       String command[] = requestURI.split("/");
	       
	       E_MypageAction action = null;
	       ActionForward forward = null;
		
		
		if(command[command.length-1].equals("e_infoSelectAction.e_mypage")){
			action = new E_InfoSelectAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command[command.length-1].equals("e_infoUpdateAction.e_mypage")){
			action = new E_InfoUpdateAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command[command.length-1].equals("e_projectListAction.e_mypage")){
			action = new E_ProjectListAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command[command.length-1].equals("e_projectSelectAction.e_mypage")){
			action = new E_ProjectSelectAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (forward != null) {
			try {
				if (forward.isRedirect()) { // redirect 시키겠다
					response.sendRedirect(forward.getPath());
				} else { // dispatch 시키겠다
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
