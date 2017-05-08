package lancer.f_mypage.mapper;

import java.util.List;

import lancer.f_mypage.model.Calendar;
import lancer.f_mypage.model.Career;
import lancer.f_mypage.model.Certificate;
import lancer.f_mypage.model.F_job;
import lancer.f_mypage.model.Freelancer;
import lancer.f_mypage.model.School;

public interface FreelancerMapper {
	public Freelancer showFreelancerInfo(int f_num);
	public List<Integer> showFreelancerJobInfo(int f_num);
	public int updateFreelancerInfo(Freelancer freelancer);
	public int deleteFreelancerJobInfo(int f_num);
	public int insertFreelancerJobInfo(F_job f_job);
	public String getFreelancerPassword(int f_num);
	public List<Career> showCareerInfo(int f_num);
	public int getCareerNum();
	public int insertCareer(Career career);
	public int updateCareer(Career career);
	public int deleteCareer(int career_num);
	public List<School> showSchoolInfo(int f_num);
	public int getSchoolNum();
	public int insertSchool(School school);
	public int updateSchool(School school);
	public int deleteSchool(int school_num);
	public List<Certificate> showCertiInfo(int f_num);
	public int getCertiNum();
	public int insertCerti(Certificate certificate);
	public int updateCerti(Certificate certificate);
	public int deleteCerti(int certificate_num);
	public String getMyProjectName(int f_num);
	public List<Calendar> getMySchedule(int f_num);
}
