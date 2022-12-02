package management;

import java.util.Scanner;

import model.ComputerScieneceStudent;
import model.EnglishLinguisticStudent;
import model.Student;

public class Main {
	
	private static Handler handler = new Handler();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student st = null;
		int row,select, index;
		String name;

		System.out.println("\n\t학생  관리 프로그램\n");
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 인덱스 번호로 삭제");
			System.out.println("0. 종료");
			System.out.println("메뉴선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1 :	// 목록
				handler.showList();
				break;
				
			case 2 :	// 추가
				System.out.println("학생 유형을 선택하세요 (1. 영문과 | 2.컴공과) : ");
				select = Integer.parseInt(sc.nextLine());
				if(select == 1) st = makeEnglishLinguisticStudent(sc);
				if(select == 2) st = makeComputerScienceStudent(sc);
				row = handler.insert(st);
				if(row==0) System.out.println("\t추가 실패\n");
				if(row==1) System.out.println("\t영문과 추가 성공\n");
				if(row==2) System.out.println("\t컴공과 추가 성공\n");
				break;
				
			case 3 :	// 검색
				System.out.println("검색할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);	// 이름을 전달하여 일치하는 학생을 찾기
				if(st!= null) st.showDetail();
				else		System.out.println(name + " 학생을 찾을 수 없습니다.");
				break;	
				
			case 4 :	// 삭제
				System.out.println("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);	// 이름을 전달받아서, 이름이 일치하는 학생 객체를 반환
				
				row = handler.delete(st);	// 그 학생을 전달하여 배열에서 제거
				if(row == 1) System.out.println("\t삭제 성공\n");
				if(row == 0) System.out.println("\t삭제 실패\n");
				break;
				
			case 5 :
				System.out.println("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				index = handler.indexOf(name);
				if(index == -1) {
					System.out.println("\t동일한 이름이 없습니다.");
					break;
				}
				row = handler.delete(index);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
				
			}
			
					
		}while(select != 0); {
			sc.close();
			System.out.println("시스템을 종료 합니다");
		}

	}

	private static Student makeComputerScienceStudent(Scanner sc) {
		String name;
		int kor, eng, mat, java, network, linux;
		
		System.out.println("이름을 입력하세요 : "); name= sc.nextLine(); 
		System.out.println("국어 점수 : ");	kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수 : ");	eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수 : ");	mat = Integer.parseInt(sc.nextLine());
		System.out.println("자바 점수 : ");	java = Integer.parseInt(sc.nextLine());
		System.out.println("네트워크 점수 : "); network = Integer.parseInt(sc.nextLine());
		System.out.println("리눅스 점수 : "); linux = Integer.parseInt(sc.nextLine());
		
		Student st = new ComputerScieneceStudent(name, kor, eng, mat, java, network, linux);
		return st;

	}

	private static Student makeEnglishLinguisticStudent(Scanner sc) {
		String name;
		int kor, eng, mat, literature, translation;
		
		System.out.println("이름을 입력하세요 : "); name= sc.nextLine(); 
		System.out.println("국어 점수 : ");	kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수 : ");	eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수 : ");	mat = Integer.parseInt(sc.nextLine());
		System.out.println("문학 점수 : ");	literature = Integer.parseInt(sc.nextLine());
		System.out.println("번역 점수 : ");	translation = Integer.parseInt(sc.nextLine());
		
		Student st = new EnglishLinguisticStudent(name, kor, eng, mat, literature, translation);
		return st;
	}
}

