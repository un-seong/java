package test;

import java.util.Date;

public class dddddddd {
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(1500000000000L);
		long gap = d1.getTime() - d2.getTime(); 
		System.out.println("두 객체의 차 : " + gap);
		System.out.println("두 객체의 차 : " + (gap / 1000 / 60 / 60 / 24) + "일");
	}
}
