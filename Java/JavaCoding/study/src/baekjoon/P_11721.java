package baekjoon;

import java.util.Scanner;

public class P_11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		while(true) {
			if(word.length()==0 || word.length()>100) {
				word = sc.nextLine();
			}			
			break;
		}
		int quo = word.length();
		
		for (int i= 0; i<word.length(); ) {
			if(quo / 10 > 0) {
				System.out.println(word.substring(i, i+10));	
				quo -= 10;
			} else {
				System.out.println(word.substring(i));
				
			}
			i+=10;
		}
		sc.close();
	}

}
