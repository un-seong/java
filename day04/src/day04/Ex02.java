package day04;

public class Ex02 {
	// y = f(x)
	static int getMaxNum(int a, int b, int c) {
		int max = a;
		if (max<b) max = b;
		if (max<c) max = c;
		return max;
	}

	static int getReverseNumber(int number) {
		int n1 = 0;
		while(number!=0) {
			n1 *= 10;
			n1 += number % 10;
			number /= 10;
		}return n1;
			
	}

	//	static int getReverseNumber(int number) {
//		int n1 = 0;
//		while(true) {
//			n1 *= 10;
//			n1 += number % 10;
//			number /= 10;
//			if(number < 0) {
//				return n1 + number;
//			}
//		}
//	}
	
	
	static int getFee(int time) {
		int start = 3000;
		int add = 50;
		int money = 0;
		if(time <= 30) {
			money = start;
		}
		else {
			money = start + (add * time);
		}
		return money;	
	}
	
//	static int getFee(int time) {
//		int fee = 3000;
//		if(time > 30) {
//			fee += ((time - 21) / 10) * 500;
//		}
//		return fee;
//	}
	
//	static int getFee(int time) {
//		int over = ((time - 21) / 10) * 500;
//		return time > 30 ? 3000 + over : 3000;
		// 삼항 연산은 값을 결정하고, return은 값을 반환하기 때문에
		// 조건에 따라서 서로 다른 2개의 값을 반환할 경우
		// return 다음에 삼항 연산을 사용할 수도 있다
		//	time > 30 ? 3000 + over : 3000; 
		// 		조건       ? 	     옳은 결과         : 아닌 결과;
//	}
	
	private static int getSummary(int a, int b) {
		int c = 0;
		for(int i=a; i<=b; i++) {
			c += i;
		}
		return c;
	}
	
//	static int getSummary(int a, int b) {
//		return ( a + b ) *( b - a + 1 ) / 2;
//	}
	
	public static void main(String[] args) {
		
		// 1) 세 정수를 전달 받아서, 가장 큰 수를 반환하는 함수를 정의 하고 호출하여 확인하세요
		int n1 = getMaxNum(2, 5, 3);
		System.out.println("n1 : " + n1);
		
		// 2) 정수를 전달받아서, 정수를 거꾸로 뒤집은 값을 반환하는 함수를 작성하세요
		int n2 = getReverseNumber(1234);
		System.out.println("n2 : " + n2);
		
		// 3) 놀이기구 이용시간에 따른 요금을 계산하여 반환하는 함수를 작성하세요
		int n3 = getFee(40);
		System.out.println("n3 : "+ n3);
		
		// 4) 두 정수 a, b 를 전달받아서 a와 b 사이의 모든 합계를 반환하는 함수를 작성하세요
		int n4 = getSummary(1, 100);
		System.out.println("n4 : "+ n4);
	}
	
}
