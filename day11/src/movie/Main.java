package movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	static void prepareDummy() throws ParseException {
		Movie t1 = new Movie("블랙아담", "자움 콜렛세라",
				"드웨인 존슨,노아센티네오,피어스 브로스넌,퀸테사 스윈들".split(","),
				"액션", 125, sdf.parse("2022-10-19"), 7.63);
		
		Movie t2 = new Movie("공조2", "이석훈",
				"현빈, 유해진, 윤아, 다니엘 헤니, 진선규".split(","),
				"액션", 129, sdf.parse("2022-09-07"), 8.02);
		
		Movie t3 = new Movie("인생은 아름다워", "최국희",
				"류승룡, 염정아, 박세완, 옹성우".split(","),
				"뮤지컬", 122, sdf.parse("2022-09-28"), 8.36);
		
		Handler.arr[0] = t1;
		Handler.arr[1] = t2;
		Handler.arr[2] = t3;
			
	}
		
	public static void main(String[] args) throws Exception {
		prepareDummy();
//		
//		System.out.println(Handler.getList());
		
	
		Scanner sc = new Scanner(System.in);
		int row = 0, menu;
		String find, name, result;
		
		
		
		do {
			System.out.println("1. 간편 목록 보기");
			System.out.println("2. 검색 하기");
			System.out.println("3. 추가하기");
			System.out.println("4. 삭제하기");
			System.out.println("5. 수정하기");
			System.out.println("6. 상세보기");
			System.out.println("0. 종료하기");
			System.out.println("선택 하세요 >>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
				case 1 : 
					System.out.println(Handler.getList());
					break;
					
				case 2 :
					System.out.println("찾으실 요소를 입력하세요 : ");
					System.out.println(Handler.search(sc.nextLine()));
					break;
					
				case 3 : 
					Movie ob = insert(sc);
					row = Handler.insert(ob);
					System.out.println(row == 1 ? "추가 성공" : "추가 실패");
					break;
										
					
				case 4 :
					System.out.println("삭제할 번호 입력해주세요! [1. 번호 | 2. 제목] :");
					menu = Integer.parseInt(sc.nextLine());
					row = delete(sc, menu);
					System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
					break;
					
				case 5 : 
					System.out.println("수정할 제목을 입력하세요 : ");
					find = sc.nextLine();
					System.out.println("변경할 제목을 입력하세요 : ");
					name = sc.nextLine();
					result = Handler.update(find, name);
					if(result != null) System.out.println("수정 성공!");
					if(result == null) System.out.println("수정 실패!");
					break;
				case 6 : 
					System.out.println(Handler.getDetail());
					break;
							
			}
			
		}while(menu!=0); 
			System.out.println("종료합니다.");
			sc.close();
				
	}
	

		
	static int delete(Scanner sc, int menu) {
		int idx, row = 0;
		String name;
		if(menu == 1) {
			System.out.println("삭제할 번호를 입력하세요 : ");
			idx = Integer.parseInt(sc.nextLine());
			row = Handler.delete(idx);
		}
		else if (menu == 2) {
			System.out.println("삭제할 제목을 입력하세요 : ");
			name = sc.nextLine();
			row = Handler.delete(name);
		}
		return row;
	}
	
	static Movie insert(Scanner sc) throws Exception {
		String title, director, genre;
		String[] actors;
		int runningTime;
		Date openningDate;
		double grade;
		
		System.out.println("영화 이름 : ");
		title = sc.nextLine();
		
		System.out.println("감독 : ");
		director = sc.nextLine();
		
		System.out.println("배우 : ");
		actors = sc.nextLine().split(",");
		
		System.out.println("장르 : ");
		genre = sc.nextLine();
		
		System.out.println("상영시간 : ");
		runningTime = Integer.parseInt(sc.nextLine());
		
		System.out.println("상영 일자 : ");
		openningDate = sdf.parse(sc.nextLine());
		
		System.out.println("별점 : ");
		grade = Double.parseDouble(sc.nextLine());
		
		Movie ob = new Movie(title, director, actors, genre, runningTime, openningDate, grade);
		return ob;
		
	}
}
