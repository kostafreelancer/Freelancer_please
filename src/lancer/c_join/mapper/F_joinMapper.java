package lancer.c_join.mapper;

import java.util.List;

import lancer.c_join.model.F_join;

public interface F_joinMapper {
	int insert_f_join(F_join f_join);
	public int getnum();
	public List<String> getAllId();
}
