package example.classExam;

public class Fruit_exam {

	public static void main(String[] args) {
		Fruit f1 = new Fruit("banana", 4800);
		Fruit f2 = new Fruit("strawberry", 21000);
		Fruit f3 = new Fruit("persimmon", 19000);
		Fruit f4 = new Fruit("cherry", 12000);
		
		System.out.println("======== 과일 구입 목록 ========");
		System.out.println(f1.fname +" : "+f1.price);
		System.out.println(f2.fname +" : "+f2.price);
		System.out.println(f3.fname +" : "+f3.price);
		System.out.println(f4.fname +" : "+f4.price);
		
		System.out.println("-----------------------------");
		
		int total = f1.price+f2.price+f3.price+f4.price;
		System.out.println("총금액 : "+total+"원");
		System.out.printf("할인후 결제 금액 : %d원",(int)(total*0.85));
	}

}
