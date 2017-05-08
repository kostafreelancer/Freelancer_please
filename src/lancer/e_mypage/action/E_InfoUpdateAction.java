package lancer.e_mypage.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
