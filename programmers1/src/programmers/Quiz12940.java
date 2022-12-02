package programmers;

public class Quiz12940 {
	public static void main(String[] args) {
		int n = 2;
		int m = 5;
		
		for(int i = 1; i <= m; i++) {
			if(n % i == 0) {
				System.out.println("n약수는 : " + i);
			}		
		}
		
		for(int j = 1; j<=n; j++) {
			if(m % j == 0) {
				System.out.println("m약수는 : " + j);
			}
		}
		
		
		
		
	}
}
