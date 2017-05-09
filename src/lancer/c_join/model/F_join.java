package lancer.c_join.model;

import java.io.Serializable;

public class F_join implements Serializable{
	private int f_num;
	private String f_id;
	private String f_pwd;
	private String f_fname;
	private String f_name;
	private String f_birth;
	private String f_sex;
	private String f_hphone;
	private String f_phone;
	private String f_email;
	private String f_address;
	private String f_major;
	private String f_nowstate;
	private String f_recentlogin;
	private double  f_score;
	
	public F_join(){}

	public F_join(int f_num, String f_id, String f_pwd, String f_fname, String f_name, String f_birth, String f_sex,
			String f_hphone, String f_phone, String f_email, String f_address, String f_major, String f_nowstate,
			String f_recentlogin, double f_score) {
		super();
		this.f_num = f_num;
		this.f_id = f_id;
		this.f_pwd = f_pwd;
		this.f_fname = f_fname;
		this.f_name = f_name;
		this.f_birth = f_birth;
		this.f_sex = f_sex;
		this.f_hphone = f_hphone;
		this.f_phone = f_phone;
		this.f_email = f_email;
		this.f_address = f_address;
		this.f_major = f_major;
		this.f_nowstate = f_nowstate;
		this.f_recentlogin = f_recentlogin;
		this.f_score = f_score;
	}

	public int getF_num() {
		return f_num;
	}

	public void setF_num(int f_num) {
		this.f_num = f_num;
	}

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	public String getF_pwd() {
		return f_pwd;
	}

	public void setF_pwd(String f_pwd) {
		this.f_pwd = f_pwd;
	}

	public String getF_fname() {
		return f_fname;
	}

	public void setF_fname(String f_fname) {
		this.f_fname = f_fname;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getF_birth() {
		return f_birth;
	}

	public void setF_birth(String f_birth) {
		this.f_birth = f_birth;
	}

	public String getF_sex() {
		return f_sex;
	}

	public void setF_sex(String f_sex) {
		this.f_sex = f_sex;
	}

	public String getF_hphone() {
		return f_hphone;
	}

	public void setF_hphone(String f_hphone) {
		this.f_hphone = f_hphone;
	}

	public String getF_phone() {
		return f_phone;
	}

	public void setF_phone(String f_phone) {
		this.f_phone = f_phone;
	}

	public String getF_email() {
		return f_email;
	}

	public void setF_email(String f_email) {
		this.f_email = f_email;
	}

	public String getF_address() {
		return f_address;
	}

	public void setF_address(String f_address) {
		this.f_address = f_address;
	}

	public String getF_major() {
		return f_major;
	}

	public void setF_major(String f_major) {
		this.f_major = f_major;
	}

	public String getF_nowstate() {
		return f_nowstate;
	}

	public void setF_nowstate(String f_nowstate) {
		this.f_nowstate = f_nowstate;
	}

	public String getF_recentlogin() {
		return f_recentlogin;
	}

	public void setF_recentlogin(String f_recentlogin) {
		this.f_recentlogin = f_recentlogin;
	}

	public double getF_score() {
		return f_score;
	}

	public void setF_score(double f_score) {
		this.f_score = f_score;
	}
	
	
}

