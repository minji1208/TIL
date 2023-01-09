package example.classExam;

public class SmartPhone_exam {

	public static void main(String[] args) {
		SmartPhone s1 = new SmartPhone("삼성", "갤럭시노트9", 1094500);
		SmartPhone s2 = new SmartPhone("애플", "아이폰XS", 1227600, 10);
		SmartPhone s3 = new SmartPhone("삼성", "갤럭시S8", 607760, 35);
		
		System.out.println("======== 제품목록 ========");
		System.out.println("-----------------------");
		System.out.println(s1.getName()+" ["+s1.getMaker()+"]");
		System.out.println("가격 : "+s1.getPrice());
		System.out.println("-----------------------");
		System.out.println(s2.getName()+" ["+s2.getMaker()+"]");
		System.out.println("가격 : "+s2.calculateDiscount());
		System.out.println("-----------------------");
		System.out.println(s3.getName()+" ["+s3.getMaker()+"]");
		System.out.println("가격 : "+s3.calculateDiscount());
		System.out.println("-----------------------");
	}

}
