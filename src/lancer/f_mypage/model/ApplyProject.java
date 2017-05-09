package lancer.f_mypage.model;

import java.io.Serializable;

public class ApplyProject implements Serializable{
	private int f_pr_num;
	private String p_name;
	private String manager_hphone;
	private String f_pr_date;
	private String state;
	
	public ApplyProject(){}

	public ApplyProject(int f_pr_num, String p_name, String manager_hphone, String f_pr_date, String state) {
		super();
		this.f_pr_num = f_pr_num;
		this.p_name = p_name;
		this.manager_hphone = manager_hphone;
		this.f_pr_date = f_pr_date;
		this.state = state;
	}

	public int getF_pr_num() {
		return f_pr_num;
	}

	public void setF_pr_num(int f_pr_num) {
		this.f_pr_num = f_pr_num;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getManager_hphone() {
		return manager_hphone;
	}

	public void setManager_hphone(String manager_hphone) {
		this.manager_hphone = manager_hphone;
	}

	public String getF_pr_date() {
		return f_pr_date;
	}

	public void setF_pr_date(String f_pr_date) {
		this.f_pr_date = f_pr_date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
