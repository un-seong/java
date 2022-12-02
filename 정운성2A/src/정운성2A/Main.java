package 정운성2A;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
	
	public static void main(String[] args) throws Exception  {
		
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		int menu, row;
		String todoInput, todoCompletion, todoDelete;
		Todo td;
		Date todoDay;
				
		do {
			System.out.println("\t Simple Todo List (작성자 : 정운성)\n");
			System.out.println("1. 목록 | 2. 추가 | 3. 완료처리 | 4. 삭제 | 0. 종료");
			System.out.print("메뉴 선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			
			case 1:	// 목록
				System.out.println(hd.todoAll());
				break;
				
			case 2: // 추가
				System.out.println("할일 입력  : ");
				todoInput = sc.nextLine();
				System.out.println("날짜 입력(yyyy.MM.dd) : ");
				todoDay = sdf.parse(sc.nextLine());
				td = new Todo(todoInput, todoDay);
				row = hd.insert(td);
								
				if(row==1) System.out.println("추가 성공\n");
				if(row==0) System.out.println("추가 실패\n");
				break;
						
			case 3: // 완료처리
				System.out.println("완료 처리할 일정의 이름 입력 : ");
				todoCompletion = sc.nextLine();
				row = hd.completion(todoCompletion);				
				
				if(row==1) System.out.println("수정 성공\n");
				if(row==0) System.out.println("수정 실패\n");
				break;
				
			case 4: // 삭제
				System.out.println("삭제할 일정의 이름 입력 : ");
				todoDelete = sc.nextLine();
				row = hd.delete(todoDelete);
								
				if(row==1) System.out.println("삭제 성공\n");
				if(row==0) System.out.println("삭제 실패\n");
				break;
			}
						
		}while(menu!=0); {
			System.out.println("시스템 종료");
			sc.close();
		}
	}
	
}
