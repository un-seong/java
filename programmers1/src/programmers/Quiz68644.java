package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Quiz68644 {
	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };
		int[] answer = {};		
			
		HashSet<Integer> set = new HashSet<>(); 
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        answer = new int[set.size()];

        int count = 0;
        for(int x : set) {
        	arr.add(x);
        }
        Collections.sort(arr);
        for(int x : arr) {
        	answer[count] = x;
        	count++;
        }  
	}	
}



//List<Integer> list = new ArrayList<Integer>();
//System.out.println(list.toString());
//
//for(int i = 0; i < num.length-1; i++) {
//	for(int j = i+1; j <num.length; j++) {
//		list.add(num[i] + num[j]);
//		list.sort((a ,b) -> a-b);
//	}
//}		
//System.out.println("정리 전 : " + list.toString());
//
//for(int i = 0; i< list.size()-1; i++) {
//	for(int j = i+1; j <list.size(); j++) {
//		if(list.get(i) == list.get(j)) {
//			list.remove(j);
//		}
//	}
//}
//System.out.println("정리 후 : " + list.toString());
//		
//for(int i = 0; i< list.size()-1; i++) {
//	for(int j = i+1; j <list.size(); j++) {
//		if(list.get(i) == list.get(j)) {
//			list.remove(j);
//		}
//	}
//}			
//System.out.println("정리 후 : " + list.toString());
//		
//int[] answer = new int[list.size()];
//
//for(int i = 0; i< list.size(); i++) {
//	answer[i] = list.get(i);
//}	