package lancer.c_join.mapper;

import java.util.List;

import lancer.c_join.model.E_join;

public interface E_joinMapper {
	int insert_e_join(E_join e_join);
	public Integer getnum();
	public List<String> getAllId();
}
