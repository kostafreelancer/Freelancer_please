package lancer.f_mypage.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lancer.f_mypage.action.Action;
import lancer.f_mypage.action.ActionForward;
import lancer.f_mypage.action.DeleteApplyProject;
import lancer.f_mypage.action.DeleteCareerAction;
import lancer.f_mypage.action.DeleteCertificateAction;
import lancer.f_mypage.action.DeleteSchoolAction;
import lancer.f_mypage.action.InsertCareerAction;
import lancer.f_mypage.action.InsertCertificateAction;
import lancer.f_mypage.action.InsertSchoolAction;
import lancer.f_mypage.action.ScheduleAjax;
import lancer.f_mypage.action.ShowFreelancerInfoAction;
import lancer.f_mypage.action.ShowScheduleInfoAction;
import lancer.f_mypage.action.UpdateCareerAction;
import lancer.f_mypage.action.UpdateCertificateAction;
import lancer.f_mypage.action.UpdateFreelancerInfoAction;
import lancer.f_mypage.action.UpdateSchoolAction;
import lancer.f_mypage.model.Calendar;
import lancer.f_mypage.model.FreelancerDao;



@WebServlet("*.f_mypage")
public class kwangsikController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public kwangsikController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	String requestURI = request.getRequestURI();

    	//String contextPath = request.getContextPath();
    	//String command = requestURI.substring(contextPath.length()+1);
    	ActionForward forward = null;
    	Action action = null;
    	//System.out.println(command);
        String command[] = requestURI.split("/");
        
    	
    	
    	if(command[command.length-1].equals("showFreelancerInfo.f_mypage")){
    		action = new ShowFreelancerInfoAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("updateFreelancerInfo.f_mypage")){
    		action = new UpdateFreelancerInfoAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("insertCareer.f_mypage")){
    		action = new InsertCareerAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("updateCareer.f_mypage")){
    		action = new UpdateCareerAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("deleteCareer.f_mypage")){
    		action = new DeleteCareerAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("insertSchool.f_mypage")){
    		action = new InsertSchoolAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("updateSchool.f_mypage")){
    		action = new UpdateSchoolAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("deleteSchool.f_mypage")){
    		action = new DeleteSchoolAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("insertCerti.f_mypage")){
    		action = new InsertCertificateAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("updateCerti.f_mypage")){
    		action = new UpdateCertificateAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("deleteCerti.f_mypage")){
    		action = new DeleteCertificateAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("showScheduleInfo.f_mypage")){
    		action = new ShowScheduleInfoAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("deleteApplyProject.f_mypage")){
    		action = new DeleteApplyProject();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command[command.length-1].equals("scheduleInfoAjax.f_mypage")){
    		ScheduleAjax scheduleAjax = new ScheduleAjax();
    		scheduleAjax.ScheduleAjaxPrint(request, response);
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
