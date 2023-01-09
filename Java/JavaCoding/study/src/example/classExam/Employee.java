package example.classExam;

public class Employee {
	public String empno;
	public int gi;
	private int su;
	private int se;
	private int bong;
	private String grad;
	
	public Employee() {}
	public Employee(String empno, int gi) {
		this.empno = empno;
		this.gi = gi;
		su = (int)(gi * 0.15);
		se = (int)(gi * 0.2);
		bong = gi + su - se;
		if(bong>=500000) {
			grad="관리자";
		} else {
			grad="영업";
		}
		
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getSe() {
		return se;
	}
	public void setSe(int se) {
		this.se = se;
	}
	public int getBong() {
		return bong;
	}
	public void setBong(int bong) {
		this.bong = bong;
	}
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	
	public String printEmployee() {
		return this.empno+" | " + this.gi + " |\t" + this.su + " |\t" + this.se + " |\t" + this.bong + " |\t" + this.grad;
	}
}
