package lancer.f_mypage.model;

import java.io.Serializable;

public class Career implements Serializable{
	private int career_num;
	private int f_num;
	private String company;
	private String dept;
	private String rank;
	private String term;
	private String location;
	
	public Career(){}

	public Career(int career_num, int f_num, String company, String dept, String rank, String term, String location) {
		super();
		this.career_num = career_num;
		this.f_num = f_num;
		this.company = company;
		this.dept = dept;
		this.rank = rank;
		this.term = term;
		this.location = location;
	}

	public int getCareer_num() {
		return career_num;
	}

	public void setCareer_num(int career_num) {
		this.career_num = career_num;
	}

	public int getF_num() {
		return f_num;
	}

	public void setF_num(int f_num) {
		this.f_num = f_num;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
