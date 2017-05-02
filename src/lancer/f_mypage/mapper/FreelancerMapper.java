package lancer.f_mypage.mapper;

import java.util.List;

import lancer.f_mypage.model.Freelancer;

public interface FreelancerMapper {
	public Freelancer showFreelancerInfo(int f_num);
	public List<Integer> showFreelancerJobInfo(int f_num);

}
