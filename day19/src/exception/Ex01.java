package exception;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// Exception : 프로그램에서 발생할 수 있는 예외 상황을 객체로 취급하여 처리하는 클래스
		// java.lang.Exception
		
		// 예외 : 예측 할 수 있는 문제상황, 적절한 처리를 통해 처리할 수 있음
		// 에러 : 코드 상의 결함으로 발생하는 프로그램 내부에서 처리할 수 없는 문제 상황
		
		Scanner sc = new Scanner(System.in);
		int n1;
		
		System.out.println("정수 입력 : ");
		n1 = sc.nextInt();
		
		System.out.println("n1 : " + n1);
		sc.close();
	}
}
