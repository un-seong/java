package programmers;

import java.util.ArrayList;
import java.util.List;

public class Quiz12935 {
	public static void main(String[] args) {
		int[] arr = {9,9,8,1,4,5,7};
		
		List<Integer> list = new ArrayList<Integer>();		
		
		for(int i = 0; i< arr.length; i++) {
			list.add(arr[i]);
		}
							
		list.sort((a,b)->b-a);
		
		int[] answer = new int[list.size()-1];
		
		if(list.size() == 1) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			for(int i = 0; i<list.size()-1; i++) {
				if(list.get(i) > list.get(i+1)) {
					answer[i] = list.get(i);
				}
			}
		}
				
				
        // 확인
		System.out.println("list : " + list.toString());
		for(int i =0; i<answer.length; i++) {
			System.out.println("answer : " + answer[i]);
		}
	}
}
