package example.classExam;

public class SmartPhone {
	private String maker;
	private String name;
	private int price;
	private int discountRate;
	
	public SmartPhone() {}
	public SmartPhone(String maker, String name, int price) {
		this.maker = maker;
		this.name = name;
		this.price = price;
	}
	
	public SmartPhone(String maker, String name, int price, int discountRate) {
		this.maker = maker;
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public int calculateDiscount() {
		price = price*(1-(discountRate/100));
		return price;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
}
