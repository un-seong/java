package programmers0;

public class Quiz120923 {
	public static void main(String[] args) {
		int num = 5;
		int total = 15;
//		int[] answer = {};
		int[] answer = new int[num];
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);
		System.out.println(answer[3]);
		System.out.println(answer[4]);

		
		// num의 개수 만큼 더해야 한다.
					
		int result = 0;
				
		for(int i = 0 ; i < total; i++) {
			result = i+(i+1)+(i+2)+(i+3)+(i+4);
			if(result == total) {
				answer[num-num+0] = i;
				answer[num-num+1] = i+1;
				answer[num-num+2] = i+2;
				answer[num-num+3] = i+3;
				answer[num-num+4] = i+4;
				System.out.println("result : " + result);
		}
			
	}

		for(int s : answer) {
			System.out.println(s);
		}
//		System.out.println(answer[0]);
//		System.out.println(answer[1]);
//		System.out.println(answer[2]);
//		System.out.println(answer[3]);
//		System.out.println(answer[4]);
		
		
		
		
		
	}
}
