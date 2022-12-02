package programmers0;

import java.util.ArrayList;

public class Quiz120889 {
	public static void main(String[] args) {
		int[] sides = { 199, 72, 222 };
		int answer = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(sides[0]);
		list.add(sides[1]);
		list.add(sides[2]);
		
		for(int d : list) {
			System.out.println(d);
		}
		
		list.sort((a,b)-> b-a);
		
		for(int d : list) {
			System.out.println(d);
		}
		
		if(list.get(0) < list.get(1)+list.get(2)) {
			answer = 2;
		}else {
			answer = 1;
		}
		
		System.out.println(answer);
		
		
		
			
	}
	
}
