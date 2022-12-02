package serialize;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws ParseException, ClassNotFoundException, IOException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Handler hd = new Handler();
		
		int select, row;
		String title;
		Date date;
		Todo td;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("1. 내용 보기");
			System.out.println("2. 파일로 저장");
			System.out.println("3. 추가");
			System.out.println("4. 제거");
			System.out.println("0. 종료");
			System.out.println("메뉴 선택 >>>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			
			case 1 : 
				hd.show();
				break;
				
			case 2: // 저장
				hd.save();				
				break;
				
			case 3 : // 추가
				System.out.println("할 일의 이름 : ");				title = sc.nextLine();
				System.out.println("할 일의 날짜(yyyy.MM.dd) : ");	date = sdf.parse(sc.nextLine());
				td = new Todo(title, date);
				row = hd.insert(td);
				if(row == 1) System.out.println("\t추가 성공");
				break;
				
			case 4 : // 제거
				System.out.println("제거 할 번호를 입력하세요 : ");
				select = Integer.parseInt(sc.nextLine());
				row = hd.delete(select);
				if(row == 1) System.out.println("\t삭제 성공");
				break;
			}
						
		}while(select !=0); {
			System.out.println("시스템 종료");
		}
		
	}
}
