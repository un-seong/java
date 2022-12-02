package oop;

class Test2 {
	
	int num;
	
	// 기본 생성자
	Test2() {
		this(0);
		System.out.println("기본 생성자 호출 !!");
//		this(0);
		// Constructor call must be the first statement in a constructor
		//	1) 객체의 생성 (생성이 완료되지 않으면, 추가 작업을 진행 할 수 없다)
		//	2) 객체의 생성 이후 초기값 할당 및 추가 작업 진행
	}
	
	Test2(int num) {
		this.num = num;
		System.out.println("int 를 전달 받는 생성자 호출 !!");
	}
	
}


public class Ex05 {
	public static void main(String[] args) {
		Test2 ob1 = new Test2();
		Test2 ob2 = new Test2(12);		
	}
}
