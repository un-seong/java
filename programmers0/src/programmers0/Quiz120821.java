package programmers0;

public class Quiz120821 {
	public static void main(String[] args) {
		int[] num_list = { 1, 2, 3, 4, 5 };
		int[] answer = new int[num_list.length];
		int count = num_list.length;
				
		for(int i = 0; i< num_list.length; i++) {
			answer[count-1] = num_list[i];
			count--;
		}
		

 	}
}
