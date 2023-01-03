package basic.class_exam;

public class Fruit {
	String fname;
	int price;
	
	public Fruit() {}
	
	public Fruit(String fname, int price) {
		this.fname = fname;
		this.price = price;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
