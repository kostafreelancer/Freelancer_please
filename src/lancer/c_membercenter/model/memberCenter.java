package lancer.c_membercenter.model;

import java.io.Serializable;

public class memberCenter implements Serializable {
	public String f_name;
	public String f_hPhone;
	public String f_email;
	public String e_ename;
	public String e_phone;
	public String e_email;
	
	public memberCenter(){}

	public memberCenter(String f_name, String f_hPhone, String f_email, String e_ename, String e_phone,
			String e_email) {
		super();
		this.f_name = f_name;
		this.f_hPhone = f_hPhone;
		this.f_email = f_email;
		this.e_ename = e_ename;
		this.e_phone = e_phone;
		this.e_email = e_email;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getF_hPhone() {
		return f_hPhone;
	}

	public void setF_hPhone(String f_hPhone) {
		this.f_hPhone = f_hPhone;
	}

	public String getF_email() {
		return f_email;
	}

	public void setF_email(String f_email) {
		this.f_email = f_email;
	}

	public String getE_ename() {
		return e_ename;
	}

	public void setE_ename(String e_ename) {
		this.e_ename = e_ename;
	}

	public String getE_phone() {
		return e_phone;
	}

	public void setE_phone(String e_phone) {
		this.e_phone = e_phone;
	}

	public String getE_email() {
		return e_email;
	}

	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	
	
}

