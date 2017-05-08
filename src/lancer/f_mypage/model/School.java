package lancer.f_mypage.model;

import java.io.Serializable;

public class School implements Serializable{
	private int school_num;
	private int f_num;
	private String school_name;
	private String major;
	private String term;
	private String location;
	
	public School(){}
	
	public School(int school_num, int f_num, String school_name, String major, String term, String location) {
		super();
		this.school_num = school_num;
		this.f_num = f_num;
		this.school_name = school_name;
		this.major = major;
		this.term = term;
		this.location = location;
	}

	public int getSchool_num() {
		return school_num;
	}

	public void setSchool_num(int school_num) {
		this.school_num = school_num;
	}

	public int getF_num() {
		return f_num;
	}

	public void setF_num(int f_num) {
		this.f_num = f_num;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
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
