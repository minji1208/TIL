package example.inheritanceExam;

class Car{
	private String color;
	private int account;
	
	public Car(String color, int account) {
		this.color = color;
		this.account = account;
	}

	public String getColor() {
		return color;
	}

	public int getAccount() {
		return account;
	}
	
	public String toString() {
		return "[색상] "+this.color+"\t[생산수량] "+this.account;
	}
}

class Monata extends Car{
	private String series;
	private String use;
	
	public Monata(String color, int account, String series, String use) {
		super(color, account);
		this.series = series;
		this.use = use;
	}
	
	public String toString() {
		return super.toString()+"\t[용도] "+this.use+"\t[시리즈] "+this.series;
	}
}

public class CarMain {

	public static void main(String[] args) {
		Monata m1 = new Monata("흰색", 5000, "NF", "승용");
		Monata m2 = new Monata("은색", 7000, "Brilliant", "업무");
		Monata m3 = new Monata("감홍색", 4000, "EF", "택시");
		Monata m4 = new Monata("검정색", 6000, "Hybrid", "승용");
		
		System.out.println("========================== Monata 생산 시작 ==========================");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
	}

}
