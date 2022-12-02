package day02;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// if 문제
		
		/*
		 * 	이용시간에 따라 요금을 책정하는 놀이기구가 있다
		 * 	기본요금 3천원으로 시작하여 10분당 추가요금 500원이 발생한다
		 * 	요금표는 아래와 같은 규칙으로 적용한다
		 * 
		 * 	0~30	3000원
		 * 	31~40	3500원
		 * 	41~50	4000원
		 * 	...
		 * 
		 * 이용시간을 분으로 입력받아서, 금액을 계산하여 출력하는 코드를 작성하세요.
		 */
		
		int start = 3000, add_money=500, time;
						
		Scanner sc = new Scanner(System.in);
		System.out.println("이용시간 입력 : ");
		time = sc.nextInt();
		sc.close();
		System.out.println("이용시간 : "+ time + "분");
		
				
		if(time<=30) {
			System.out.println(start + "원");
		}
		
		else if(time%10 != 0){
			add_money = 500*((time-30)/10)+start+500;
			System.out.println("이용요금 : " + add_money +"원");
		}
		
		else {
			add_money = 500*((time-30)/10)+start					;
			System.out.println("이용요금 : " + add_money +"원");
		}
					
		
//		elseif가 ==, != 상관없다.
// 				
//		if(time<=30) {
//			System.out.println(start + "원");
//		}
//		else if(time%2 == 0){
//			add_money = 500*((time-30)/10)+start;
//			System.out.println("이용요금 : " + add_money +"원");
//		}
//		else {
//			add_money = 500*((time-30)/10)+start+500;
//			System.out.println("이용요금 : " + add_money +"원");
//		}

	}
}
