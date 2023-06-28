package baekjoon;

import java.util.Scanner;

public class P_2460 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max_num=0;
		int sum=0;
		int in_num, out_num;
		
		do {
			out_num = sc.nextInt();
			in_num = sc.nextInt();
			sum = sum+in_num-out_num;
			if(sum>max_num) {
				max_num=sum;				
			}
		} while(sum!=0);
		System.out.println(max_num);
	}

}
