package lancer.c_login.model;

public class checking_identity {
	private c_login_freelancer free;
	private String identity;
	private c_login_enterprise enter;
	public checking_identity(){}
	public checking_identity(c_login_freelancer free, String identity, c_login_enterprise enter) {
		super();
		this.free = free;
		this.identity = identity;
		this.enter = enter;
	}
	public c_login_freelancer getFree() {
		return free;
	}
	public void setFree(c_login_freelancer free) {
		this.free = free;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public c_login_enterprise getEnter() {
		return enter;
	}
	public void setEnter(c_login_enterprise enter) {
		this.enter = enter;
	}
	
	
}
