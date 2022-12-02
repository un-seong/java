package programmers;

public class Quiz86051 {
	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3, 4, 6, 7, 8};
		int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
						
		int answer = 0;
		int sum = 0;
		int sum1 = 0;
		
		for(int i = 0; i<a.length; i++) {
			System.out.println("a : " + a[i]);
			sum += a[i];
		}
		System.out.println("sum : " + sum);
		
		
		for(int j=0; j<b.length; j++) {
			System.out.println("b : " + b[j]);
			sum1 += b[j];
		}
		System.out.println("sum1 : " + sum1);
		
		System.out.println(sum1-sum);
				
	}

	
}
	    

