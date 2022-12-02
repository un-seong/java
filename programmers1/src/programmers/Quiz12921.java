package programmers;

public class Quiz12921 {
	public static void main(String[] args) {
		int n = 10;
		int[] arr = new int[n+1];
		
		int count = 0;
		int c1 = 0;
		
		// 1 ~ 5 까지 나눌꺼다
		// 2를 나눴을때 1, 2로 나눠지니까 소수
		// 3을 나눴을때 1, 3 으로 나눠 지니까 소수
		// 4를 나눴을때 1, 2, 4로 나눠지니까 소수 아님
		// 5를 나눴을때 1, 5로 나눠지니까 소수임
		// count가 2개면 소수이고 아니면 소수가아니다 맞지?
		
		// arr에 숫자 다 담음
		for(int i = 1; i<= n; i++) {
			arr[i]= i;
			System.out.print(arr[i]);
		}
		System.out.println();
				
		for(int i=2; i<=n; i++) {
			for(int j = i*2; j <=n; j+=i ) {
				arr[j]=0;
			}
		}
		
		for(int i =0; i< arr.length; i++) {
			if(arr[i]!= 0) {
				count++;
			}
		}
		
		System.out.println("count : " + count);
	
		
		
		
						
		
	}
}
