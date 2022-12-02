package day05;

public class Ex01 {
	public static void main(String[] args) {
		// 1) 문자열을 원하는 서식에 맞춰서 만들어주는 String.format()
		
		
		
		
		String name = "아메리카노";
		int price = 1500;
		System.out.printf("%s : %,d원\n", name, price);
		
		// printf()는 문자열을 서식에 맞춰서 화면에 출력한다
		// String.format()은 같은 방법으로 문자열을 만들어서 반환한다(변수에 저장 가능)
		
		String result = String.format("%s : %,d원\n", name, price);
		System.out.println(result);
		
		// 서식 제어 문자
		/*
		 * 	제어문자	자료형
		 * 	%s		String		문자열을 표현하는 서식문자
		 * 	%d		정수			정수를 10진수 형태로 표현
		 * 	%f		실수			실수를 표현
		 * 	%c		글자			정수를 코드에 맞는 글자로 표현(char)
		 * 	%x		정수			정수를 16진수 형태로 표현
		 * 
		 * 1) %와 글자 사이에 정수를 넣어서 자리차지할 칸 수를 지정할 수 있다
		 * 2) 정수는 %02d 와 같이 2자리로 출력하고, 값이 부족하면 0으로 채울 수 있다
		 * 3) 실수는 %.2f 와 같이 소수점 이하 자리를 2자리 까지만 표현할 수 있다
		 * 4) 숫자는 %,d 와 같이 천단위 구분기호를 자동으로 처리할 수 있다
		 * 
		 */
		 
		System.out.printf("[%s]\n", "Java");
		System.out.printf("[%10s]\n", "Java");
		System.out.printf("[%-10s]\n", "Java");
		
		System.out.printf("[%d]\n", 1326000);
		System.out.printf("[%9d]\n", 1326000);
		System.out.printf("[%09d]\n", 1326000);
		System.out.printf("[%,09d]\n", 1326000);
		
		System.out.printf("[%02d : %02d]\n", 127/60, 127%60); // 가변인자
		
		System.out.printf("[%f]\n", 3.14); // 자릿수를 지정하지 않으면 소수점 이하 6자리 까지
		System.out.printf("[%f]\n", 3.1415926535);
		System.out.println(3.1415926535);
		System.out.printf("[%.2f]\n", 3.1415926535); // 소수점 이하 2자리 까지
	 // System.out.printf("[%.2f]\n", 100); // 정수 넣으면 예외 발생, 뒤에 .0 이라도 붙여야함
		
		System.out.printf("[%c]\n", 65);
		System.out.printf("[%c]\n", 66);
		System.out.printf("[%c]\n", 44032);
		System.out.printf("[%c]\n", 44033);
		System.out.printf("[%c]\n", '나');
		System.out.printf("[%c]\n", '나'+ 1);
		
		
		
		
		
		
		
		
		
	}
}
