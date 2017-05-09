package lancer.f_main.mapper;

import java.util.List;

import lancer.f_main.model.member;

public interface f_main_mapper {
	public List<member> getF_info();
	public int countFreelancer();
	public int countProject();
}
