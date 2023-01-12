package baekjoon.bronze;

import java.util.Scanner;

public class P_3460 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t];
		
		int n;
		
		String[] k = new String[t];
		
		for(int j = 0; j < arr.length; j++) {
			n = sc.nextInt();
			arr[j] = n;
			StringBuffer sb = new StringBuffer(Integer.toBinaryString(n));
			String re = sb.reverse().toString();
			k[j]=re;
		}
		
		for(String s : k) {
			for(int x = 0; x < s.length(); x++) {
				if(s.charAt(x)=='1') {
					System.out.print(x+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
