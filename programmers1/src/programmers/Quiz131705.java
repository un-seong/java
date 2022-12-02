package programmers;

public class Quiz131705 {
	public static void main(String[] args) {
		int[] number = { -3, -2, -1, 0, 1, 2, 3 };
		int answer = 0;
		
		// 0 3 6
		
		for(int i = 0 ; i < number.length-2; i++) {
			for(int j = i+1 ; j < number.length-1; j++) {
				for(int z=j+1; z<number.length; z++) {
					if(number[i] + number[j] + number[z] == 0) {
						answer++;
					}	
				}
				
			}
		}		
		
		System.out.println(answer);
	
	}
}
