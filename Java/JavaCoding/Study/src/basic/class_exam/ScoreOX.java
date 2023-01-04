package basic.class_exam;

public class ScoreOX {
	private int no;
	private String name;
	private int[] dap;
	private int cnt;
	private int score = 0;
	private int rank;
	private char[] c_ox = new char[5];
	public static int tot;
	
	public ScoreOX() {
		
	}
	
	public ScoreOX(int no, String name, int[] dap) {
		this.no = no;
		this.name = name;
		this.dap = dap;
	}
	
	public void compute() {
		cnt=0;
		for(int i = 0;i<dap.length;i++) {
			if(dap[i]==1) {
				c_ox[i] = 'O';
				tot+=1;
				cnt+=1;
			} else {
				c_ox[i]='X';
			}
		}
		score = cnt*20;
	}
	
	public void display() {
		System.out.printf("%d\t%s  ",no,name);
		for(char o:c_ox) {
			System.out.print(o+"    ");
		}
		System.out.print(score+"\t"+rank);
		System.out.println();
	}
	
	public void ranking(ScoreOX[] sc) {
		for(int i = 0; i< sc.length;i++) {
			sc[i].rank = 1;
			for(int j = 0; j<sc.length; j++) {
				if(sc[i].score<sc[j].score) {
					sc[i].rank = sc[i].rank+1;
				}
			}
		}
	}
}
