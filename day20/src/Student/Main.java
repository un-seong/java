package Student;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Handler handler = new Handler();	// 생성자에서 파일을 읽어들인다
		
//		handler.showList();
		Student st = null;
		int select, kor, eng, mat, row = 0, menu;
		String name;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 찾기");
			System.out.println("5. 정렬");
			System.out.println("0. 종료");
			System.out.println("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch (select) {
			case 1:
				handler.showList();
				break;

			case 2 :
				System.out.println("이름 : "); name = sc.nextLine();
				System.out.println("국어점수 : "); kor = Integer.parseInt(sc.nextLine());
				System.out.println("영어점수 : "); eng = Integer.parseInt(sc.nextLine());
				System.out.println("수학점수 : "); mat = Integer.parseInt(sc.nextLine());
				st = new Student(name, kor, eng, mat);
				handler.insert(st);
				break;
				
			case 3 : 
				System.out.println("삭제할 이름을 입력하세요 : ");
				name = sc.nextLine();
				row = handler.delete(name);
				if(row == 1) System.out.println("\t 삭제 성공");
				if(row == 0) System.out.println("\t 삭제 실패");
				break;
				
			case 4 :
				System.out.println("찾으실 이름을 입력하세요 : ");
				name = sc.nextLine();
				row = handler.find(name);
				if(row == 1) System.out.println("\t 찾기 완료");
				if(row == 0) System.out.println("\t 찾기 실패");
				break;
				
			case 5 :
				System.out.println(" 1. 이름순 | 2. 합계순 ");
				menu = Integer.parseInt(sc.nextLine());
				if(menu == 1) row = handler.nameSort();
				if(menu == 2) row = handler.sumSort();
				if(row == 1) System.out.println("\t정렬 성공 !");
				break;
								
			}
			
			
		}while(select != 0); {
			System.out.println("시스템 종료");
		}
		sc.close();
		handler.save();	// 메인이 종료되기 직전 저장한다
	}
}
