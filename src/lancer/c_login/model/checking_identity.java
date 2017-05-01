package lancer.c_login.model;

public class checking_identity {
	private int c_num;
	private String identity;
	public checking_identity(){}
	public checking_identity(int c_num, String identity) {
		super();
		this.c_num = c_num;
		this.identity = identity;
	}
	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
}
