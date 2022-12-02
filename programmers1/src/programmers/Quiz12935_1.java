package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz12935_1 {
	public static void main(String[] args) {
		int[] arr = {3,4,5,2,3,};
		
		int[] answer = {};
        int min = 0;
        int[] copy = arr.clone();
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[arr.length];
            Arrays.sort(copy);
            min = copy[0];
            int k = arr.length;

            for(int i=0; i<arr.length; i++){
                if(arr[i] == min){
                    k--;
                    continue;
                }
                list.add(arr[i]);
            }

            answer = new int[k];

            for(int i=0; i<k; i++){
                answer[i] = list.get(i);
              
            }

        }

	}
}
