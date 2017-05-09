package lancer.e_mypage.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kosta.model.ImageUtil;
import lancer.e_mypage.model.Enterprise;
import lancer.c_login.model.c_login_enterprise;
import lancer.e_mypage.model.E_MypageDao;



public class E_InfoUpdateAction implements E_MypageAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		E_MypageDao dao = E_MypageDao.getInstance();
		c_login_enterprise enterprise = new c_login_enterprise();
		
		int e_num = Integer.parseInt(request.getParameter("e_num"));
		enterprise.setE_num(e_num);
		
		String pwd1 = request.getParameter("e_pwd1");
		String pwd2 = request.getParameter("e_pwd2");
		
		if(pwd1.equals(pwd2)){
			// 비밀번호와 비밀번호 확인이 일치할 경우 변경
			enterprise.setE_pwd(pwd1);
		}else{
			// 일치하지 않을 경우 실패
			ActionForward forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("Matching_Project/e_infoSelectAction.e_mypage");
			
			return forward;
		}
		
		
		//회사이메일
		String email1 = request.getParameter("e_mail_1");
		String email2 = request.getParameter("e_mail_2");
		String e_email = email1+"@"+email2;
		enterprise.setE_mail(e_email);

		enterprise.setE_ownerfile(request.getParameter("e_ownerfile"));
		
		enterprise.setE_name(request.getParameter("e_name"));
		
		enterprise.setE_ename(request.getParameter("e_ename"));
		
		enterprise.setE_owner(request.getParameter("e_owner"));
		
		//사업자번호
		String regno_1 = request.getParameter("regno_1");
		String regno_2 = request.getParameter("regno_2");
		String regno_3 = request.getParameter("regno_3");
		String e_regno = regno_1 + "-" + regno_2 + "-" + regno_3;
		enterprise.setE_regno(e_regno);
		
		//대표번호
		String e_phone_1 = request.getParameter("e_phone_1");
		String e_phone_2 = request.getParameter("e_phone_2");
		String e_phone_3 = request.getParameter("e_phone_3");
		String e_phone = e_phone_1 + "-" + e_phone_2 + "-" + e_phone_3;
		enterprise.setE_phone(e_phone);
		
		enterprise.setE_bf(request.getParameter("e_bf"));
		
		enterprise.setManager_name(request.getParameter("manager_name"));
		
		//담당자 핸드폰번호
		String manager_hphone_1 = request.getParameter("manager_hphone_1");
		String manager_hphone_2 = request.getParameter("manager_hphone_2");
		String manager_hphone_3 = request.getParameter("manager_hphone_3");
		String manager_hphone = manager_hphone_1 + "-" + manager_hphone_2 + "-" + manager_hphone_3;
		enterprise.setManager_hphone(manager_hphone);
		
		//매니저이메일
		String manager_mail_1 = request.getParameter("manager_mail_1");
		String manager_mail_2 = request.getParameter("manager_mail_2");
		String manager_mail = manager_mail_1 + "@" + manager_mail_2;
		enterprise.setManager_mail(manager_mail);
		
		//회사 주소
		String e_address_1=request.getParameter("e_address_1");
		String e_address_2=request.getParameter("e_address_2");
		String e_address_3=request.getParameter("e_address_3");
		String e_address=e_address_1 + "&" + e_address_2 + "&" + e_address_3;
		enterprise.setE_address(e_address);
		
		enterprise.setE_homepage(request.getParameter("e_homepage"));
		
		enterprise.setStart_year(Integer.parseInt(request.getParameter("start_year")));

		enterprise.setE_enum(Integer.parseInt(request.getParameter("e_enum")));	
				
		enterprise.setE_listing(request.getParameter("e_listing"));		
				
		enterprise.setE_capital(Integer.parseInt(request.getParameter("e_capital")));
				
		enterprise.setE_sales(Integer.parseInt(request.getParameter("e_sales")));		
				
		enterprise.setE_scale(request.getParameter("e_scale"));		
				
		enterprise.setE_licensefile(request.getParameter("e_licensefile"));		
				
		
		dao.updateEnterprise(enterprise);		
		
		
		
		
		
		
		
		
		
		//파일업로드 (경로, 사이즈, 인코딩, 중첩정책)
		String uploadPath = request.getRealPath("e_mypage_ownerfile");	// e_mypage_ownerfile란 폴더의 절대경로
		int size = 20 * 1024 * 1024;		// 20MB
				
		MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
		
		//파일업로드
		if(multi.getFilesystemName("b_fname") != null){
			String b_fname = multi.getFilesystemName("b_fname");
			board.setB_fname(b_fname);
					
			//썸네일 이미지(jpg, gif, png) aaa.gif => aaa_small.gif
			String pattern = b_fname.substring(b_fname.lastIndexOf(".")+1);	// gif
			String headName = b_fname.substring(0, b_fname.lastIndexOf("."));
			
			//원본 File객체
			String imagePath = uploadPath + "\\" + b_fname;
			File src = new File(imagePath);
					
			//썸네일 이미지 => File객체
			String thumImagePath = uploadPath + "\\" + headName + "_small." + pattern;
			File dest = new File(thumImagePath);
					
			if(pattern.equals("jpg") || pattern.equals("gif")){			// ImageUtil 클래스의 메소드 사용
				ImageUtil.resize(src, dest, 100, ImageUtil.RATIO);
			}
					
					
					
			}else{
				board.setB_fname("");
			}		
		
		
		
		
		
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("Matching_Project/e_mypage/e_project.jsp");
		
		return forward;
	}

}
