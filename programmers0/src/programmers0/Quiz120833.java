package programmers0;

import java.util.Arrays;

public class Quiz120833 {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 5 };
		int num1 = 1;
		int num2 = 2;
		int count = 0;
		int[] answer = new int[num2];
		
		answer = Arrays.copyOfRange(numbers, num1, num2+1);
		
		for(int z : answer) {
			System.out.println(z);
		}
		
		
		
		
		
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
		
		for(int i = num1; i <= num2; i++) {
			answer[count] = numbers[i];
			count++;
		}
		
		for(int x : answer) {
			System.out.println("x : "+ x);
		}
		
		
		
		
		
	}
}
