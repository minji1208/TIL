package baekjoon.bronze;

import java.util.Scanner;

public class P_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] n = new int[cnt];
		
		for(int i = 0; i<cnt; i++) {
			n[i] = sc.nextInt();
		}
		
		int max = n[0];
		int min = n[0];
		
		for(int x : n) {
			if(max < x) { //max가 s보다 작으면 
				max = x;
			}
			if(min > x) {
				min = x;
			}
		}
		System.out.println(min + " "+max);
		sc.close();
	}

}
