package programmers0;

public class Quiz120841 {
	public static void main(String[] args) {
		int[] dot = { -7, 9 };
		int answer = 0;
		
		if(dot[0] < 0 && dot[1] > 0) {
			answer = 2;
		}else if(dot[0] < 0 && dot[1] < 0) {
			answer = 3;
		}else if(dot[0] > 0 && dot[1] > 0) {
			answer = 1;
		}else {
			answer= 4;
		}
		
		System.out.println(answer);
	}

}
