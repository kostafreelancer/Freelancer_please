package lancer.f_mypage.action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import lancer.f_mypage.model.CalEvent;
import lancer.f_mypage.model.Calendar;
import lancer.f_mypage.model.FreelancerDao;
import net.sf.json.JSONArray;

public class ScheduleAjax {
	public ScheduleAjax(){};
	
	public void ScheduleAjaxPrint(HttpServletRequest request, HttpServletResponse response){
		String f_num = request.getParameter("num");
		FreelancerDao dao = new FreelancerDao();
		List<Calendar> scheduleList = dao.getMySchedule(Integer.parseInt(f_num));
		System.out.println(f_num);
		
		List<CalEvent> ceList = new ArrayList<CalEvent>();
		for(int i=0; i<scheduleList.size(); i++){
			CalEvent ce = new CalEvent();
			ce.setTitle(scheduleList.get(i).getContents());
			ce.setStart(scheduleList.get(i).getStartdate());
			ce.setEnd(scheduleList.get(i).getEnddate());
			ceList.add(ce);
		}
		String str =JSONArray.fromObject(ceList).toString();
		
		System.out.println(str);
		response.setCharacterEncoding("utf-8");
		try {
			response.getWriter().print(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
