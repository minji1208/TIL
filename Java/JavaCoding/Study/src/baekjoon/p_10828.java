package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p_10828 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String order = "";
		int x = sc.nextInt();
		
		Integer stack[] = new Integer[x];
		int top = -1;
		
		List<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < x+1; i++) {
			
			order = sc.nextLine();
			
			if(order.equals("top")) {
				if(top != -1) {
					answer.add((int)stack[top]);
				} else {
					answer.add(top);
				}
			}
			
			if(order.equals("size")) {
				answer.add(top+1);
				
			}
			
			if(order.equals("empty")) {
				if(top == -1) {
					answer.add(1);
				} else {
					answer.add(0);
				}
			}
			
			if(order.equals("pop")) {
				if(top != -1) {
					int pop = (int)stack[top];
					stack[top] = null;
					--top;
					answer.add(pop);
				} else {
					answer.add(top);
				}
				
			}
			
			if(order.contains("push")) {
				int idx = order.indexOf(" ");
				stack[++top] = Integer.parseInt(order.substring(idx+1));
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i : answer) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);

	}

}
