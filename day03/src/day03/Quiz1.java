package day03;

import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n1 = ran.nextInt(15) +1;
		int n2 = ran.nextInt(15) +1;
		int n3 = ran.nextInt(15) +1;
		
		
		System.out.printf("%d, %d, %d\n", n1, n2, n3);
		/*
		 * 		1층에서 15층 사이의 엘리베이터 3개가 있습니다
		 * 		사용자에게 현재층을 입력받아서 가장 가까운 엘리베이터가 이동할 수 있도록
		 * 		출력문을 만들어서 출력해주세요
		 */
		
		System.out.println("계신 층 입력 : ");
		int a = sc.nextInt();
				
		int current1 = n1 - a;
		int current2 = n2 - a;
		int current3 = n3 - a;		
		
		if(current1<0) {
			current1 *= -1;
		}
		if(current2<0) {
			current2 *= -1;
		}
		if(current3<0) {
			current3 *= -1;
		}
				
	
		int min = current1;
				
		if(current2<min) {
			min = current2;
			System.out.println("두번쨰 엘베");
		}else if(current3<min ) {
			min = current3;
			System.out.println("세번째 엘베");
		}else {
			System.out.println("첫번째 엘베");
		}
	
		
	}
}
