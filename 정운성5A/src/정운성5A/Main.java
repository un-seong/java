package 정운성5A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째의 값을 입력하세요 : ");
		int n = sc.nextInt();
		System.out.println("두번째의 값을 입력하세요 : ");
		int m = sc.nextInt();
		int sum = n + m;
		System.out.println("두 수의 합은 : " + sum);
		
	}
}
