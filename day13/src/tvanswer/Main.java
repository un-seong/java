package tvanswer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TV tv = new TV();
		Scanner sc = new Scanner(System.in);
				
		int menu;
		// TV 클래스를 구성하여 실제 현실의 TV기능을 모두 구현해보세요
		// main에서는 TV의 메서드만 호출합니다

		tv.powerBtn();
		
		do {
			System.out.println("\t-- Samsung TV --");
			System.out.println("1. 채널 up");
			System.out.println("2. 채널 down");
			System.out.println("3. 음량 up");
			System.out.println("4. 음량 down");
			System.out.println("5. 음소거");
			System.out.println("0. 종료");
			System.out.print("메뉴 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 :
				tv.channelUp();
				break;
			case 2 : 
				tv.channelDown();
				break;
			case 3 :
				tv.volumeUp();
				break;
			case 4 :
				tv.volumeDown();
				break;
			case 5 :
				tv.muTe();
				break;
			}
			
			
		}while(menu!=0); {
			tv.powerBtn();
		
		}
//		while(tv.getPower()==true); {
//			System.out.println("시스템 종료");
//		}
		
		
	}
}			
