package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int input=1, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		

		// 1) 길이가 정해지지 않은 반복
		// 사용자에게 정수를 입력받아서 합계를 누적시킨다
		// 만약 0 을 입력하면 '더이상 더하지 않겠다' 라는 의미로 생각하여 반복을 중단한다
		while(input!=0) {
			System.out.println("숫자를 입력하세요");
			input = sc.nextInt();
			sum += input ;
		}
		
		System.out.println("더이상 더하지 않겠다");
		System.out.println("sum : "+ sum);
		sc.close();

		}
		
		
	}

		//	해답 
		//	int input, sum=0;
		//
		//	while(true) {
		//		System.out.println("정수입력 : ");
		//		input = sc.nextInt();
		//	
		//		sum += input;
		//		if(input == 0) {
		//			break;
		//		}
		//		System.out.println("sum : "+ sum);
		//		sc.close();
		//

