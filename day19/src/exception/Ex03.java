package exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int[] arr = { 10, 30, 20, 40, 50 };
		Scanner sc = new Scanner(System.in);
		int index;
		
		
		try {
			
			System.out.println("몇번째 정수를 출력할까요 : ");
			index = sc.nextInt();
			System.out.printf("arr[%d] : %d\n", index, arr[index]);
			
		}catch(Exception e) {
			System.out.println("정수를 입력하세요!");
		}

		

		sc.close();
	}
}
