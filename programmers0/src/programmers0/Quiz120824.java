package programmers0;

public class Quiz120824 {
	public static void main(String[] args) {
		int[] num_list = {1,2,3,4,5};
		int odd = 0;
		int even = 0;
		int[] answer = {even, odd};
		
		System.out.println(num_list[0]);
		System.out.println(num_list[1]);
		System.out.println(num_list[2]);
		System.out.println(num_list[3]);
		System.out.println(num_list[4]);
		
		
		for(int i = 0; i< num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		
		answer[0] = even;
		answer[1] = odd;
		
		
		for(int x : answer) {
			System.out.println("x : " + x);
		}
		
	}
}
