package programmers0;

public class Quiz120816 {
	public static void main(String[] args) {
		int slice = 7;
		int n = 10;
		int answer = 0;
		
		if(n % slice != 0) {
			answer = (n / slice)+1;
		}
		else {
			answer = n / slice;
		}
		
		System.out.println(answer);
	}
}
