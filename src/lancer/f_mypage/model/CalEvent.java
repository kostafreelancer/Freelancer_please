package lancer.f_mypage.model;

public class CalEvent {
	private String title;
	private String start;
	private String end;
	
	public CalEvent(){}
	public CalEvent(String title, String start, String end) {
		super();
		this.title = title;
		this.start = start;
		this.end = end;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	
}
