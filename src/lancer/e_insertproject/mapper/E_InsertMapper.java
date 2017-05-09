package lancer.e_insertproject.mapper;

import java.util.List;
import java.util.Map;

import lancer.e_insertproject.model.E_Insert;
import lancer.e_mypage.model.Enterprise;


public interface E_InsertMapper {
	int insertProject(E_Insert project);
	public int getnum();
	int insertP_Job(Map<String, Integer> map);
}
