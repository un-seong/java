package programmers;

public class Quiz12933 {
	public static void main(String[] args) {
		long answer = 0;
		long n = 118372;
			
		long n1 = n % 10; // 1의 자리
		long n2 = n % 100 / 10; // 2자리
		long n3 = n % 1000 / 100; // 3 자리
		long n4 = n % 10000 / 1000; // 4자리
		long n5 = n % 100000 / 10000; // 5 자리
		long n6 = n % 1000000 / 100000; // 6자리
		
	
		
		
			
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		
		
		
		
		
		
	}
}
