package day03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		// 0 ~ 30 사이의 정수를 입력받아서,입력받은 위치에 ↑ 가 위치 하도록 코드를 작성하세요
		
		String bar1 = "┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐\n";
		String bar2 = "│    │    │    │    │    │    │\n";
		String bar3 = "↑";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print(bar1 + bar2);
		sc.close();
		
		for(int i=0; i<a; i++) {
			System.out.print(" ");
			
		}System.out.println(bar3);
	
	
	
	}
}
