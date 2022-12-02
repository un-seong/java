package programmers0;

public class Quiz120817 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer = 0;
		
		
		for(int i = 0; i< numbers.length; i++) {
			int sum = numbers[i];
			answer += sum;			
		}
		
		System.out.println(answer/numbers.length);
	}
}
