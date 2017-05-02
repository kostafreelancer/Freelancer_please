package lancer.c_freelancerlist.mapper;

import java.util.List;

import lancer.c_freelancerlist.model.c_freelancerlist_career;
import lancer.c_freelancerlist.model.c_freelancerlist_portfolio;
import lancer.c_freelancerlist.model.c_freelancerlist_school;
import lancer.c_freelancerlist.model.c_freelancerlist_total;

public interface c_freelancerMapper {
	public List<c_freelancerlist_total> c_freelancerlist_select_basic();
	public String c_freelancer_list();
	public List<c_freelancerlist_school> c_freelancerlist_select_school(int f_num);
	public List<c_freelancerlist_career> c_freelancerlist_select_career(int f_num);
	public List<c_freelancerlist_portfolio> c_freelancerlist_select_portfolio(int f_num);
	public List<String> c_freelancerlist_select_job(int f_num);
	
}
