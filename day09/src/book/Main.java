package book;

import java.util.Scanner;

public class Main {
	
	static Handler handler;
	
	public static void main(String[] args) {
		
		Yes24[] arr = {
				
				new Yes24("트렌드 코리아 2023", "김난도", "미래의창", 17100, 4),	
				new Yes24("아버지의 해방일지", "정지아", "창비", 13500, 4.1),	
				new Yes24("주술회전 20 더블특장판", "아쿠타미 게게", "서울미디어코믹스", 5400, 0),	
				
			};
			
			handler = new Handler(arr);
			
			Scanner sc = new Scanner(System.in);
			int row = 0, menu;
			String result;
		
		do {
			System.out.println("1. 책 추가");
			System.out.println("2. 책 목록");
			System.out.println("3. 책 삭제");
			System.out.println("0. 종료");
			System.out.println("선택 하세요 >>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu){
				case 1 :
					Yes24 ob = input(sc);
					row = handler.insert(ob);
					System.out.println(row == 1 ? "추가 성공" : "추가 실패");
					break;
				case 2 : 
					result = handler.getList();
					System.out.print(result);
					break;
				case 3 :
					System.out.print("어떤 값으로 삭제합니까 (1. 번호 | 2. 제목) : ");
					menu = Integer.parseInt(sc.nextLine());
					row = delete(sc, menu);
					System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
								
			}
						
		}while(menu != 0);
		System.out.println(" 프로그램을 종료 합니다. ");
		sc.close();
	}
	
	static int delete(Scanner sc, int menu) {
		int index, row = 0;
		String name;
		if(menu == 1) {	// 번호로 삭제하기
			System.out.print("도서 번호를 입력하세요 : ");
			index = Integer.parseInt(sc.nextLine());
			row = handler.delete(index);
		}
		else if(menu == 2) {	// 제목으로 삭제하기
			System.out.print("도서 제목을 입력하세요 : ");
			name = sc.nextLine();
			row = handler.delete(name);
		}
		else {
			System.out.println("메뉴 선택이 잘못되었습니다. 다시 시도해주세요");
		}
		return row;
	}
	
	
	static Yes24 input(Scanner sc) {
		String name, author, publisher;
		int price;
		double starPoint;
		
		System.out.println("책 이름 : ");
		name = sc.nextLine();
		
		System.out.println("저자 : ");
		author = sc.nextLine();
		
		System.out.println("출판사 : ");
		publisher = sc.nextLine();
		
		System.out.println("가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.println("별점 : ");
		starPoint = Double.parseDouble(sc.nextLine());
		
		Yes24 ob = new Yes24(name, author, publisher, price, starPoint);
		return ob;
	}

}
