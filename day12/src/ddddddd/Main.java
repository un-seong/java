package ddddddd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 사용자 입력 -> main의 지역변수 -> 클래스의 생성자로 전달 -> 객체의 멤버필드에 저장 -> 객체를 배열에 저장	
		
		// 사용자의 입력을 받아서 객체를 생성(이름, 국어, 영어, 수학)하고 핸들러에게 전달하고 결과를 출력
		// 사용자의 입력에 따라 핸들러가 반환하는 정보를 출력 (전체, 단일검색)
		// 사용자 입력에 따라 기존 객체를 찾아서 점수를 수정하고 결과를 출력
		// 사용자 입력에 따라 기존 객체를 찾아서 삭제하고 결과를 출력
		
		String name, result, find, delete;	// 출력할 결과는 문자열 형태의 result
		int kor = 0, eng, mat, sum;	
		double avg;
		int menu, point;
		int row;	// 함수의 처리 결과를 보고받는 정수형 row
		Student st;
		Handler hd = new Handler();
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			System.out.println("\t학생 점수 표\n");
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 단일검색");
			System.out.println("4. 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.println("메뉴 선택 >>>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 : // 목록
				result = hd.studentAll();
				System.out.println(result);
				break;
				
			case 2 : // 추가
				System.out.println("이름 : ");	name = sc.nextLine();
				System.out.println("국어 점수 : ");	kor = Integer.parseInt(sc.nextLine());
				System.out.println("영어 점수 : ");	eng = Integer.parseInt(sc.nextLine());
				System.out.println("수학 점수 : ");	mat = Integer.parseInt(sc.nextLine());
				st = new Student(name, kor, eng, mat);
				
				row = hd.insert(st);
				if(row==1) System.out.println("추가 성공!");
				if(row==0) System.out.println("추가실패ㅠㅠ");
				break;
				
			case 3 : // 단일검색
				System.out.println("알고 싶은 학생을 입력하세요 : ");
				find = sc.nextLine();
				result = hd.search(find);
				System.out.println(result);
				break;
				
			case 4 : // 수정
				System.out.println("바꿀 점수의 학생 이름을 입력하세요 : ");
				find = sc.nextLine();
				System.out.println("바꾸실 과목을 정하세요. 1. 국어 | 2. 영어 | 3. 수학| 4. 전체점수 변경" );
				menu = Integer.parseInt(sc.nextLine());
				if(menu==1) {
					System.out.println("바꿀 국어 점수 : "); kor = Integer.parseInt(sc.nextLine());
					hd.update1(find, kor);
					row = hd.update1(find, kor);
				}
				else if(menu==2) {
					System.out.println("바꿀 영어 점수 : ");	eng = Integer.parseInt(sc.nextLine());
					hd.update2(find, eng);
					row = hd.update2(find, eng);
				}
				else if(menu==3) {
					System.out.println("바꿀 수학 점수 : ");	mat = Integer.parseInt(sc.nextLine());
					hd.update3(find, mat);
					row = hd.update3(find, mat);
				}
				else {
					System.out.println("바꿀 국어 점수 : "); kor = Integer.parseInt(sc.nextLine());
					System.out.println("바꿀 영어 점수 : "); eng = Integer.parseInt(sc.nextLine());
					System.out.println("바꿀 수학 점수 : "); mat = Integer.parseInt(sc.nextLine());
					hd.update4(find, kor, eng, mat);
					row = hd.update4(find, kor, eng, mat);
				}
				
				if(row == 1) System.out.println("수정 완료!");
				if(row == 0) System.out.println("수정 실패ㅠㅠ");
				break;
				
				
			case 5 : // 삭제
				System.out.println("삭제 하고 싶은 학생을 입력하세요 : ");
				delete = sc.nextLine();
				row = hd.sdelte(delete);
				if(row == 1) System.out.println("삭제 되었습니다!");
				if(row == 0) System.out.println("결과가 없습니다!");
				break;
			} 
			
			
		}
			
		while(menu!=0); {
			System.out.println("시스템 종료");
		}
	}
}
