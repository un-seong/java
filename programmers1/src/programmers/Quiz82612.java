package programmers;

import java.util.Scanner;

public class Quiz82612 {
	public static void main(String[] args) {
		int price = 3;	// 이용 요금
		int money = 20;
		int count = 3;	// 기구 탄 횟수
		long totalPrice = 0;	// 총 이용 요금
		long num = 0;
		long answer = 0;
		
		// 원래 이용료 : price;
		// 놀이기구 N번째 이용하면 N배를 받기로 함 (이용료 X 탈 횟수)
		// count 번 타게 되면금액 얼마나 모지라는지 계산하기
	
		for(int i = 1; i <=count; i++) {
			num = price*i;
			System.out.println("num : " + num);
			totalPrice += num;
		}
		System.out.println("이용 요금 : "+ totalPrice);
		
		if(totalPrice < money) {
			answer = 0;
		}else {
			answer = totalPrice - money;
		}
			
		// 모지란 요금

		System.out.println("모지란 요금 : " + answer);
	
		
	}
}
