package day03;

import java.util.Scanner;

public class Ex06answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, min;
		System.out.println("세 정수 입력");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		min = n1;
		
		if(n2<min)
			min = n2;
		if(n3 < min)
			min = n3;
		System.out.printf("%d, %d, %d 중에서 최소값은 %d입니다\n", n1, n2, n3, min);
		
		
		
		System.out.println("2) 절대값을 출력할 정수 입력 : ");
		int q2 = sc.nextInt();
		System.out.printf("%d의 절대값은 %d입니다\n",q2,q2<0 ? -q2:q2);
		
		
		
		
		System.out.println("3) 홀짝을 판별할 정수를 입력 : ");
		int q3 = sc.nextInt();
		System.out.printf("%d는 %s입니다\n", q3, q3 %2 == 0 ? "짝수" : "홀수");
	
		sc.close();
	
	}

}
