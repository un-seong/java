package tv;

import java.util.Scanner;

public class Main2 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int onoff;	// 전원 키고 끄기
			int menu;	// 음량 조절 및 채널 조절
			int volum = 0;
			int channel = 0;
			int count = 0;
										
			TV2 tv = new TV2(false, volum, channel, false);
			// TV 클래스를 구성하여 실제 현실의 TV기능을 모두 구현해보세요
			// main에서는 TV의 메서드만 호출합니다
			
			System.out.println("전원켜키 1 || 전원 끄기 0");
			onoff = Integer.parseInt(sc.nextLine());
			if(onoff == 1) {
				tv.setPower(true);
				
				do {
					
					System.out.println("\t-- Samsung TV --");
					System.out.println("1. 채널 up");
					System.out.println("2. 채널 down");
					System.out.println("3. 볼륨 up");
					System.out.println("4. 볼륨 down");
					System.out.println("5. 음소거");
					System.out.println("0. 종료");
					System.out.print("메뉴 >>> ");
					menu = Integer.parseInt(sc.nextLine());
					
					switch(menu) {
					case 1 : 
						tv.setChannel(channel);
			
					case 2 : 
						for(int i = 0; i<count; i++) {
							channel++;
							count++;
							System.out.println("채널은 " + channel +"입니다");
						}
					case 3 :
						
					case 4 :
						
					case 5 :
						tv.setMute(true);
										
					}
					
					
				}while(menu!=0); {
					System.out.println("시스템 종료");
				}
				

			}
			else {
				System.out.println("아무 반응 하지 않음!");
			}	
			
						
			
						
		}
}
