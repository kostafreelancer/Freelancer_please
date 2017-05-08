package lancer.e_mypage.mapper;

import java.util.List;
import java.util.Map;

import lancer.e_mypage.model.Enterprise;
import lancer.e_mypage.model.Project;

public interface E_MypageMapper {
	public Enterprise selectEnterprise(int e_num);
	public List<Project> listProjectReady(int e_num);
	public List<Project> listProjectDoing(int e_num);
	public List<Project> listProjectDone(int e_num);
	public Project selectProject(Map<String, Integer> map);
	public List<Integer> selectP_job(int e_pr_num);
}
