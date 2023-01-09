package example.classExam;

public class ScoreOX_exam {

	public static void main(String[] args) {
		ScoreOX[] sc = {
				new ScoreOX(1, "홍길동", new int[] {1,2,1,4,5}),
				new ScoreOX(2, "김철수", new int[] {1,1,1,1,1}),
				new ScoreOX(3, "이진희", new int[] {1,2,1,3,1}),
				new ScoreOX(4, "조현민", new int[] {1,1,1,3,1}),
				new ScoreOX(5, "최현정", new int[] {1,4,2,5,4})
		};
		
		for(int i = 0; i<sc.length; i++) {
			sc[i].compute();			
			sc[i].ranking(sc);
		}

		System.out.println("** 시험결과 **");
		System.out.println("-------------------------------------------------------");
		System.out.println("번호\t 이름  1    2    3    4    5    점수     등수");
		System.out.println("-------------------------------------------------------");

		for(int i = 0; i<sc.length; i++) {
			sc[i].display();
		}
	}

}
