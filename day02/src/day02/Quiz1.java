package day02;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args)  {
		// Scanner를 이용하여 이름과 나이, 주소를 순서대로 입력받은 후 출력하세요
		// 단, 주소는 띄워쓰기를 포함하여 입력할 수 있어야 합니다
		// 입출력에는 사용자의 입력에 따라 예외가 발생할 수 있기 때문에
		// 보통 IOException 처리를 해야하지만
		// Scanner는 내부코에서 예외처리가 되어 있어서, 예외선언을 안해도 된다
		
//		// 1) 변수선언
//		String name, address;
//		int age;
//		
//		// 2) 입력
//		Scanner nameV = new Scanner(System.in);
//		System.out.println("이름을 입력하세요 : ");
//		name = nameV.nextLine();
//				
//		Scanner ageV = new Scanner(System.in);
//		System.out.println("나이를 입력하세요 : ");
//		age = ageV.nextInt();
//				
//		Scanner addressV = new Scanner(System.in);
//		System.out.println("주소를 입력하세요 : ");
//		address = addressV.nextLine();
//		
//		// 3) 출력
//		System.out.println("이름 : "+ name);
//		System.out.println("나이 : "+ age);
//		System.out.println("주소 : "+ address);
//		
//		// 4) 마무리
//		nameV.close();
//		ageV.close();
//		addressV.close();
//		
		
		// 해답
		Scanner sc = new Scanner(System.in);
		String name, address;
		int age;
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("나이 입력 : ");
//		age = sc.nextInt();
//		sc.nextLine();
		age = Integer.parseInt(sc.nextLine());
				
		System.out.print("주소 입력 : ");
		address = sc.nextLine();
		
		System.out.println("".contentEquals(address));
		// String name = request.getParameter("name");
		// String age = request.getParameter("age");
		// int _age = Integer.ParseInt(age);
					
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		
		sc.close();
		

		
	}
}
