package 정운성3A;

import java.util.Scanner;

public class Main {
	
	private static Handler handler = new Handler();
	
	
	public static void main(String[] args) {
		
		Member mb = null;
		Scanner sc = new Scanner(System.in);
		int menu, row, select;
		String id;
		
		
		System.out.println("\n\t 회원 시스템\n");

		do {
			System.out.println("1. 회원가입(생성)");
			System.out.println("2. 회원탈퇴(삭제)");
			System.out.println("3. 전체목록");
			System.out.println("4. 단일검색");
			System.out.println("0. 시스템 종료");
			System.out.print("메뉴선택>>> ");
			System.out.println();
			menu = Integer.parseInt(sc.nextLine());		
						
			switch(menu) {
			
			case 1 :	// 회원가입(생성)
				System.out.println("번호를 선택해주세요( 1. 구매자 | 2. 판매자 : )");
				select = Integer.parseInt(sc.nextLine());
				if(select == 1 ) mb = newCustomer(sc);
				if(select == 2 ) mb = newSeller(sc);
				row = handler.insert(mb);
				if(row==0) System.out.println("\t추가실패\n");
				if(row==1) System.out.println("\t구매자 추가 성공\n");
				if(row==2) System.out.println("\t판매자 추가 성공\n");
				break;
				
			case 2 :	// 회원탈퇴(삭제)
				System.out.println("탈퇴할 ID를 입력하세요 : ");
				id = sc.nextLine();
				row = handler.delete(id);
				System.out.println(row == 1 ? "\t삭제 성공" : "\t삭제 실패(동일아이디 없음)");
				break;
				
			case 3 :	// 전체목록
				handler.listAll();				
				break;
				
			case 4 :	// 단일검색
				System.out.println("검색할 ID를 입력하세요 : ");
				id = sc.nextLine();
				mb = handler.find(id);
				if(mb == null) {
					System.out.println("검색할 대상이 없습니다.");
				}
				break;
			}	
				
			}while(menu!=0); {
				System.out.println("\t시스템을 종료합니다");
			}
			
	}
	
	

	private static Member newSeller(Scanner sc) {
		String id, name, store, password;
				
		System.out.println("ID를 입력하세요 : "); id = sc.nextLine();
		System.out.println("패스워드를 입력하세요 : "); password = sc.nextLine();
		System.out.println("이름을 입력하세요 : "); name = sc.nextLine();
		System.out.println("가게 이름을 입력하세요 : "); store = sc.nextLine();
		
		Member mb = new Seller(id, password, name, store);
		return mb;
	}

	private static Member newCustomer(Scanner sc) {
		String id, name, address, password;
				
		System.out.println("ID를 입력하세요 : ");	id = sc.nextLine();
		System.out.println("패스워드를 입력하세요 : ");		password = sc.nextLine();
		System.out.println("이름을 입력하세요 : ");	name = sc.nextLine();
		System.out.println("주소를 입력하세요 : "); address = sc.nextLine();
		
		Member mb = new Customer(id, password, name, address);
		return mb;
	}

	
}
