package basic.class_exam;

public class employee_exam {

	public static void main(String[] args) {
		Employee emp1 = new Employee("A111", 780000);
		Employee emp2 = new Employee("B222", 450000);
		Employee emp3 = new Employee("C333", 570000);
		
		System.out.println("                    봉급계산서");
		System.out.println("=========================================================================");
		System.out.println("사번\t기본급\t수당\t\t세금\t\t본봉\t\t등급");
		System.out.println("=========================================================================");
		System.out.println(emp1.printEmployee());
		System.out.println(emp2.printEmployee());
		System.out.println(emp3.printEmployee());
	}

}
