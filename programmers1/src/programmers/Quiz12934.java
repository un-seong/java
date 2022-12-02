package programmers;

public class Quiz12934 {
	public static void main(String[] args) {
		long answer;
		long n = 3;
		Long sqrt = (long) Math.sqrt(n);
		
		System.out.println(n);
		System.out.println("sqrt : " + sqrt);
		
		if(n % sqrt == 0 && n != 3) {
			answer = (sqrt+1) * (sqrt+1);
		}else {
			answer = -1;
		}
		
		System.out.println(answer);
	}
}
