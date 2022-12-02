package programmers;

public class Quiz12932 {
	public static void main(String[] args) {
		long n = 12345;
		
		String str = "" + n;
		int[] answer = new int[str.length()];
		int cnt =0;
		
		while(n !=0 ) {
			answer[cnt] = (int) (n%10);
			n /=10;
			cnt++;
		}
		
						
				
//		int a0 = n % 10;
//		int a1 = (n % 100) / 10;
//		int a2 = (n % 1000) / 100;
//		int a3 = (n % 10000) / 1000;
//		int a4 = n / 10000;
		
		
	}
}
