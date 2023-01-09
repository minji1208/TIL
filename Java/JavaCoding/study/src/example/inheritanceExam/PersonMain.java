package example.inheritanceExam;

class Person{
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String show() {
		return "이름 : " + this.name + ", 나이 : " + this.age;
	}
}

class Student extends Person{
	String hakbun;

	public Student() {
		
	}
	
	public Student(String name, int age, String hakbun) {
		this.name = name;
		this.age = age;
		this.hakbun = hakbun;
	}
	
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	
	public String show() {
		return super.show() + ", 학번 : " + this.hakbun;
	}
}

class ForeignStudent extends Student{
	String nation;
	
	public ForeignStudent() {
		
	}
	
	public ForeignStudent(String name, int age, String hakbun, String nation) {
		this.name = name;
		this.age = age;
		this.hakbun = hakbun;
		this.nation = nation;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String show() {
		return super.show() + ", 국적 : " + this.nation;
	}
}

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 56);
		Student s = new Student("한늘봄", 41, "99010001");
		ForeignStudent f = new ForeignStudent("Olivia", 39, "97060004", "U.S.A");
		
		System.out.println("사람["+p.show()+"]");
		System.out.println("학생["+s.show()+"]");
		System.out.println("외국학생["+f.show()+"]");

	}

}
