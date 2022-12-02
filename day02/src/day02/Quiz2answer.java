package day02;

import java.util.Scanner;

public class Quiz2answer {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int time, fee = 3000, overcost;
		
		System.out.println("시간 입력 (분) : ");
		time = sc.nextInt();
		
		if(time > 30) {
			if(time % 10 != 0) {
				overcost = (((time - 30)/10)+1)*500 ;	
			}
			else {
				overcost = ((time - 30)/10)*500 ;
			}
			fee += overcost;
		}
		System.out.println("요금 : "+ fee);
		sc.close();
	}
	
	// This method must return a result of type int
	static int getFee(int time) {
		int fee, overcost;
		
		if(time > 30) {
			if(time % 10 != 0) {
				overcost = (((time - 30)/10)+1)*500 ;	
			}
			else {
				overcost = ((time - 30)/10)*500 ;
			}
			fee = 3000 + overcost;
			return fee;
		}
		return 3000;

	}
}
