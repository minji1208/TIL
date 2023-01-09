package example.interfaceExam;

public class CDInfo {
	private String registerNo;
	private String title;
	
	public CDInfo(String registerNo, String title) {
		this.registerNo = registerNo;
		this.title = title;
	}
	public String getRegisterNo() {
		return registerNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
}
