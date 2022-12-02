package programmers0;

public class Quiz120583 {
	public static void main(String[] args) {
		int[] array = {1, 1, 2, 3, 4, 5};
		int n = 6;
		int answer = 0;
		
		for(int i = 0; i<array.length; i++) {
			if(array[i] == n) {
				answer ++;
			}
		}
		
		System.out.println(answer);
	}
}
