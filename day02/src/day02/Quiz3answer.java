package day02;

public class Quiz3answer {
	public static void main(String[] args) {
		int n1 = 1234;
		int n2 = 0;
		
		while(n1 != 0) {
			n2 = n2 * 10;
			n2 += n1 %10;
//			n1 = n1 /10;
			n1 /= 10;
//			if(n1 == 0) {
//				break;
//			}
		}
		
		// 해답
		// 1) n1의 가장 오른쪽 자리를 하나 가져와서 n2에 더한다
		// 2) n1의 가장 오른쪽 자리는 사용했으니 제거한다
		// 다음 숫자를 더하면 자릿수가 겹치니까 자릿수 처리
		// - 1의 자리 숫자를 10의 자리로 옮기기 위해서 0을 곱한다
		
//		n2 *=10;			// n2 = 0
//		n2 += n1 % 10;		// n2 = 4
//		n1 /= 10;			// n1 = 123
//		
//		n2 *=10;			// n2 = 40
//		n2 += n1 % 10;		// n2 = 43
//		n1 /= 10;			// n1 = 12
//		
//		n2 *=10;			// n2 = 430
//		n2 += n1 % 10;		// n2 = 432
//		n1 /= 10;			// n1 = 1
//		
//		n2 *=10;			// n2 = 4320
//		n2 += n1 % 10;		// n2 =	4321
//		n1 /= 10;			// n1 = 0
//
//		System.out.println("n2 : " + n2);
		
		int oddSum = 0, evenSum=0;
		
		for( int i = 1; i != 1001; i++) {
			boolean isOdd = i % 2 == 1;
					if(isOdd) {
				oddSum+=i;
			}
			else {
				evenSum += i;
			}
		}System.out.println("oddSum : " + oddSum + "evenSum : " + evenSum);

		
		
	}
}
