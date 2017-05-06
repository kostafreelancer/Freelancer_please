package lancer.f_mypage.mapper;

import java.util.List;

import lancer.f_mypage.model.Career;
import lancer.f_mypage.model.F_job;
import lancer.f_mypage.model.Freelancer;

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
}
