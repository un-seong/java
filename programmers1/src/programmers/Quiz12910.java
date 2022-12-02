package programmers;

import java.util.Arrays;

public class Quiz12910 {
	public static void main(String[] args) {
		int[] arr = { 2, 36, 1, 3 };
		int divisor = 1;
		
		
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
		     if(arr[i]%divisor==0) {
		              cnt++;
		           }
		       }
		       if(cnt==0) {
		    	   int answer[]={-1};
		
		        }
		        
		        int[] answer = new int[cnt];
		        
		        for(int i =0, j=0; i<arr.length; i++) {
		            if(arr[i]%divisor==0) {
		                answer[j]= arr[i];
		                j++;
		            }
		        }
		        Arrays.sort(answer);
		        for(int i = 0 ; i < arr.length; i++ ) {
		        	System.out.println(answer[i]);
		        }
		        
		 
		    }
			
	}
