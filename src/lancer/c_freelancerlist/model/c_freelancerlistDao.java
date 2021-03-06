package lancer.c_freelancerlist.model;

import java.io.InputStream;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lancer.c_freelancerlist.mapper.c_freelancerMapper;
import lancer.c_login.model.c_loginDao;

public class c_freelancerlistDao {
	private static c_freelancerlistDao dao = new c_freelancerlistDao();
	private static int PAGE_SIZE = 2;
	public static c_freelancerlistDao getInstance() {
		return dao;
	}
	public SqlSessionFactory getSqlSessionFacotry() { // SqlSessionFactory 媛�
														// sqlsession�쓣 留뚮뱾湲� �쐞�븳
														// 怨듭옣?
		String resource = "mybatis-config_c_freelancerlist.xml"; // src�뿉 �꽔�뼱�꽌 洹몃깷 �씠�젃寃� �꽔�쓣�닔 �엲�쓬
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
	}
	public List<c_freelancerlist_total> select_freelancer_basic(){
		SqlSession session = getSqlSessionFacotry().openSession();
		c_freelancerlist_total totallist = null;
		List<c_freelancerlist_total> totallists = null;
		Calendar cal = Calendar.getInstance();
		try{
			totallists = session.getMapper(c_freelancerMapper.class).c_freelancerlist_select_basic();
		}catch (Exception e) {
			e.printStackTrace();
		}
		for(int i = 0 ;i<totallists.size();i++){
			System.out.println("망할 드오냐?"+i);
			
			List<c_freelancerlist_school> list_school = session.getMapper(c_freelancerMapper.class).c_freelancerlist_select_school(totallists.get(i).getF_num());
			totallists.get(i).setList_school(list_school);
			
			List<c_freelancerlist_career> list_career = session.getMapper(c_freelancerMapper.class).c_freelancerlist_select_career(totallists.get(i).getF_num());
			totallists.get(i).setList_career(list_career);
			List<c_freelancerlist_portfolio> list_portfolio = session.getMapper(c_freelancerMapper.class).c_freelancerlist_select_portfolio(totallists.get(i).getF_num());
			totallists.get(i).setList_portfolio(list_portfolio);
			List<String> list_job = session.getMapper(c_freelancerMapper.class).c_freelancerlist_select_job(totallists.get(i).getF_num());
			totallists.get(i).setList_job(list_job);
			int age = cal.get(Calendar.YEAR)-Integer.parseInt(totallists.get(i).getF_birth().substring(0, 4))+1;
			totallists.get(i).setF_age(age);
			
			/*System.out.println(totallists.get(i).getList_school()+"첫번째 학위");*/
			if(totallists.get(i).getList_school().size() != 0){
				System.out.println("요기가 문제인거지?"+i+":"+totallists.get(i).getList_school());
				if(totallists.get(i).getList_school().get(0).getSchool_term().equals("2년")){
					totallists.get(i).setF_highest_school("대학(전문 학사)졸업");
				}else if(totallists.get(i).getList_school().get(0).getSchool_term().equals("4년")){
					totallists.get(i).setF_highest_school("대학(학사)졸업");
				}
			}
			int total_year=0;
			int total_month =0;
			for(int j=0;j<totallists.get(i).getList_career().size();j++){
				String str = totallists.get(i).getList_career().get(j).getCareer_term();
				String arr[] = str.split("년");
				total_year += Integer.parseInt(arr[0]);
				if(arr.length >= 2){
					total_month += Integer.parseInt(arr[1].substring(1, 2));
				}
			}
			if(total_month/12 >= 1){
				total_year++;
				total_month = total_month%12;
			}
			if(total_month == 0){
				totallists.get(i).setF_highest_career(total_year+"년 ");
			}else{
				totallists.get(i).setF_highest_career(total_year+"년 "+total_month+"개월");
			}
			
		}
	
		return totallists;
	}
	
	public String c_freelancer_list(){
		SqlSession session = getSqlSessionFacotry().openSession();
		String f_name=null;
		try{
			f_name = session.getMapper(c_freelancerMapper.class).c_freelancer_list();
			System.out.println(f_name);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return f_name;
	}	

	public lancer.c_freelancerlist.model.c_freelancerlist_pading c_freelancerlist_pading(HttpServletRequest request, int requestPage){
		
		int totalPageCount;
		int startPage;
		int endPage;
		List<c_freelancerlist_pading> pading_list;
		List<c_freelancerlist_total> list = null;
		List<c_freelancerlist_total> totallists = (List<c_freelancerlist_total>) request.getAttribute("totallists");
		int totalCount = totallists.size();
		totalPageCount = totalCount/PAGE_SIZE;
		if(totalCount%PAGE_SIZE > 0){
			totalPageCount++;
		}
		startPage = requestPage - (requestPage-1)%5;
		endPage = startPage+4;
		if(endPage > totalPageCount){
			endPage = totalPageCount;
		}
		
		int startRow = (requestPage -1) * PAGE_SIZE;
		int j=0;
		for(int i=startRow;i<startRow+PAGE_SIZE;i++){
			list.set(j,totallists.get(i));
			j++;
		}
		
		return new c_freelancerlist_pading(list, requestPage, totalPageCount, startPage, endPage);
	}
	
}
