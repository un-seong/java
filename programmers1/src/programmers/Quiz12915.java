package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz12915 {
	public static void main(String[] args) {
//		String[] string = { "abce", "abcd", "cdx" };
		String[] string = { "sun", "bed", "car" };
		int n = 1;
		String[] answer = new String[string.length];
		Arrays.sort(string);
		
		for(int i = 0; i<string.length; i++) {
			answer[i] = string[i].substring(n, n+1);
		}
		Arrays.sort(answer);
		
		List<String> list = new ArrayList<String>(Arrays.asList(string));
		for(int i = 0; i< answer.length; i++) {
			for(int j = 0; j< list.size(); j++) {
				if(list.get(j).substring(n, n+1).equals(answer[i])) {
					answer[i] = list.get(j);
					list.remove(list.get(j));
					break;
				}
			}			
		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);
		
		
	}
}
