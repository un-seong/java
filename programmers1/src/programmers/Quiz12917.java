package programmers;

import java.util.ArrayList;
import java.util.List;

public class Quiz12917 {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		List<String> list = new ArrayList<String>();
		String answer = "";
				
		System.out.println(s.substring(0,1));
		System.out.println(s.substring(1,2));
		System.out.println(s.substring(2,3));
		System.out.println(s.substring(3,4));
		System.out.println(s.substring(4,5));
		System.out.println(s.substring(5,6));
		System.out.println(s.substring(6,7));
		
		for(int i = 0; i < s.length(); i++) {
			list.add(s.substring(i,i+1));
			list.sort((a,b)-> b.compareTo(a));
		}
		System.out.println(list);
		
		for(int i = 0; i<list.size(); i++) {
			answer += list.get(i);
		}
		
		System.out.println(answer);
		
	
		
			
		
		
	}
}
