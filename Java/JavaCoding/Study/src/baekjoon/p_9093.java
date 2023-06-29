package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p_9093 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		List<String> ps = new ArrayList<>();
		
		for(int i = 0; i <= x; i++) {
			
			String wd = sc.nextLine();
			String[] words = wd.split("\\s");
			String pas = "";
			
			for(int k = 0; k < words.length; k++) {
				String word = words[k];
				String reverse = "";
				
				for(int l = word.length()-1; l >= 0; l--) {
					reverse += word.charAt(l);
				}
				
				if(k != words.length-1) {
					pas = pas+reverse+" ";
				} else {
					pas = pas+reverse;
				}
			}
			
			ps.add(pas);
		}
		sc.close();
		StringBuilder sb = new StringBuilder();

		for(String s : ps) {
			sb.append(s).append("\n");
		}
		System.out.println(sb);

	}

}
