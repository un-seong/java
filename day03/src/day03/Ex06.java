package day03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// if 문제
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		// 1) 세정수를 입력 받아서, 최소값을 찾아서 출력하세요
		if(a<b) {
			if(a<c) {
				System.out.println("최소값  : "+ a);
			}
		}else if(b<a) {
			if(b<c) {
				System.out.println("최소값 : " + b);
			}else {
				System.out.println("최소값 : " + c);
			}
		
		}
		
		// 2) 정수를 입력받아서, 정수의 절대값을 출력하는 코드를 작성하세요
		
		int q1 = sc.nextInt();
			if(q1<0) {
				System.out.println(q1 * -1);
			}else	{	
				System.out.println(q1);
			}
			
		
		// 3) 정수를 입력받아서, 입력받은 수가 홀수인지 짝수인지 판별하여 결과를 문자열로 출력하세요
		
		if(a<b) {
			if(a<c) {
				System.out.println("최소값  : "+ a);
				if (a%2 == 0) {
					System.out.println("짝수");
				}else {
					System.out.println("홀수");
				}
			}
		}else if(b<a) {
			if(b<c) {
				System.out.println("최소값 : " + b);
				if (b%2 ==0) {
					System.out.println("짝수");
				}else {
					System.out.println("홀수");
				}
			}else {
				System.out.println("최소값 : " + c);
				if (c%2 ==0) {
					System.out.println("짝수");
				}else {
					System.out.println("홀수");
				}
			}
		
		}
		
		sc.close();
		
		
		
	}
}
