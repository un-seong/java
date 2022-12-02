package thread;

class N extends Thread {
	void show() {
		for(int i = 0; i< 25; i++) {
			System.out.print(i + " ");
		}
	}
	@Override
	public void run() {	// Thread 클래스의 run()을 오버라이딩하여 다중 작업하고 싶은 내용을 작성한다
		show();		
	}
}

class A {
	void show() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
	}
}

public class Ex07 {	// thread : 하나의 프로그램에서 여러 함수가 동시다발적으로 실행되도록 처리하는 클래스
	public static void main(String[] args) {
		N ob1 = new N();
		A ob2 = new A();
//		ob1.show();
//		ob1.run();	// 실행내용을 작성한 함수이지만, 다중실행은 되지 않는다
		ob1.start();	// run() 메서드의 내용을 별도의 스레드에서 실행하도록 한다
		ob2.show();	
		System.out.println();
		
		
		// 1) Thread 클래스를 상속한 새로운 클래스를 작성한다
		// 2) Thread 클래스의 public void run() 메서드를 오버라이딩하여 원하는 내용을 작성한다
		// 3) 새로운 클래스의 객체를 생성하여 start() 메서드를 호출한다
				
		
		
		
	}
}
