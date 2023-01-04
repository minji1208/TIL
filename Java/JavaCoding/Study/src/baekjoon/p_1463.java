package baekjoon;

import java.util.Scanner;

public class p_1463 {

	public static void main(String[] args) {
		
		int temp=0;
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		while(x!=1) {
			if(x%3==0) {
				x= x/3;
				temp+=1;
			} 
			if(x%2 == 0) {
				x = x/2;
				temp+=1;
			} else {
				x-=1;
				temp+=1;
			}
		}
		
		System.out.println(temp);
	}

}
