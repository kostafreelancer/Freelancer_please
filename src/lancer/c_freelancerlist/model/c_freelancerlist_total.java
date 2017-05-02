package lancer.c_freelancerlist.model;

public class c_freelancerlist_total {
	private Integer f_num;
	private String f_id;
	private String f_name;
	private String f_sex;
	private String f_birth;
	private String f_major;
	private Integer job_id;
	private String job_name[];
	private String career_term;
	private String school_term;
	public c_freelancerlist_total(){}
	public c_freelancerlist_total(Integer f_num, String f_id, String f_name, String f_sex, String f_birth,
			String f_major, Integer job_id, String[] job_name, String career_term, String school_term) {
		super();
		this.f_num = f_num;
		this.f_id = f_id;
		this.f_name = f_name;
		this.f_sex = f_sex;
		this.f_birth = f_birth;
		this.f_major = f_major;
		this.job_id = job_id;
		this.job_name = job_name;
		this.career_term = career_term;
		this.school_term = school_term;
	}
	public Integer getF_num() {
		return f_num;
	}
	public void setF_num(Integer f_num) {
		this.f_num = f_num;
	}
	public String getF_id() {
		return f_id;
	}
	public void setF_id(String f_id) {
		this.f_id = f_id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getF_sex() {
		return f_sex;
	}
	public void setF_sex(String f_sex) {
		this.f_sex = f_sex;
	}
	public String getF_birth() {
		return f_birth;
	}
	public void setF_birth(String f_birth) {
		this.f_birth = f_birth;
	}
	public String getF_major() {
		return f_major;
	}
	public void setF_major(String f_major) {
		this.f_major = f_major;
	}
	public Integer getJob_id() {
		return job_id;
	}
	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
	}
	public String[] getJob_name() {
		return job_name;
	}
	public void setJob_name(String[] job_name) {
		this.job_name = job_name;
	}
	public String getCareer_term() {
		return career_term;
	}
	public void setCareer_term(String career_term) {
		this.career_term = career_term;
	}
	public String getSchool_term() {
		return school_term;
	}
	public void setSchool_term(String school_term) {
		this.school_term = school_term;
	}
	
	
}
