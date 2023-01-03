package basic;

public class student_exam {

	   public static void main(String[] args) {
	      Student s = new Student("홍길동", 1, 1, 100, 60, 76);
	      
	      String str = s.info();
	      System.out.println(str);
	   }

	}


	class Student{
	   String name;
	   int ban;
	   int no;
	   int kor;
	   int eng;
	   int math;
	   
	   
	   public Student(String name, int ban, int no, int kor, int eng, int math) {
	      this.name=name;
	      this.ban = ban;
	      this.no=no;
	      this.kor = kor;
	      this.eng=eng;
	      this.math=math;
	   }
	   
	   public String info() {
	      int total = (kor+eng+math);
	      double avg = ((double)total/3);
	        String result = name+","+ban+","+no+","+kor+","+eng+","+math+","+total+","+String.format("%.1f",avg);
	      return result;
	   }
	}
