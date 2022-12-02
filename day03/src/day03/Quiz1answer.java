package day03;

import java.util.Random;
import java.util.Scanner;

public class Quiz1answer {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n1 = ran.nextInt(15) +1;
		int n2 = ran.nextInt(15) +1;
		int n3 = ran.nextInt(15) +1;
		int current;
		
		
		System.out.printf("%d, %d, %d\n", n1, n2, n3);
		System.out.println("현재 몇층입니까 : ");
		current = sc.nextInt();		// 현재 층수를 입력받는다
		
		int d1 = current - n1;		// 현재 층과 각 엘리베이터 층수의 [차이]를 구한다
		int d2 = current - n2;
		int d3 = current - n3;
		
		d1 = d1 < 0 ? -d1 : d1;		// 위 혹은 아래 방향에 상관없이 [거리]를 구하기 위해 [절대값] 처리한다
		d2 = d2 < 0 ? -d2 : d2;
		d3 = d3 < 0 ? -d3 : d3;
		
		int min = d1;				// [거리 중에서 최소값]을 찾아낸다
		if(min > d2)	min = d2;
		if(min > d3)	min = d3;
		
		
		// 최소값과 일치하는 요소가 이동하는 형식을 출력한다
		if( min == d1)	System.out.println("첫번째 엘리베이터가 움직입니다.");
		if( min == d2)	System.out.println("두번째 엘리베이터가 움직입니다.");
		if( min == d3)	System.out.println("세번째 엘리베이터가 움직입니다.");
		
	}
}
