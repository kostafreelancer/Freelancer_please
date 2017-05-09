package lancer.c_join.mapper;

import java.util.List;
import java.util.Map;

import lancer.c_join.model.F_job;
import lancer.c_join.model.F_join;

public interface F_joinMapper {
	int insert_f_join(F_join f_join);
	public int getnum();
	public List<String> getAllId();
	public int insert_F_Job(F_job f_job);
}
