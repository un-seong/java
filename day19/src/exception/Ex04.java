package exception;

import java.util.Scanner;

class MyException extends Exception {
	// 내가 원하는 새로운 예외 객체를 생성하려면, 먼저 클래스를 작성하고 Exception 클래스를 상속받는다
	
	private static final long serialVersionUID = 4784325408937262347L;

	@Override
	public String toString() {
		return "이미 입력된 값입니다";
	}
}


public class Ex04 {
	// 중복확인하는 함수
		static boolean isDuplicate(String[] arr, String str) {
			for(int i = 0; i < arr.length; i++) {
				if(str.equals(arr[i])) {
					return true;
				}
			}
			return false;
		}
		
		// 배열의 모든 칸에 문자열이 들어있는지 확인하는 함수
		static boolean isFull(String[] arr) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == null) {
					return false;
				}
			}
			return true;
		}
		
		// 배열의 빈 칸에 요소를 추가하는 함수
		static void insert(String[] arr, String str) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == null) {
					arr[i] = str;
					break;
				}
			}
		}
		
		// main
		public static void main(String[] args) {
			
			String[] arr = new String[5];
			Scanner sc = new Scanner(System.in);
			String str;
			
			while(isFull(arr) == false) {
				System.out.print("문자열 입력 : ");
				str = sc.nextLine();
				if(isDuplicate(arr, str)) {
					// 내가 규정한 새로운 예외 객체를 생성한다
					try {
						// 내가 직접 만든 클래스로도 예외를 규정하고 사용할 수 있다
						MyException ex = new MyException();
						throw ex;	// throw로 예외 객체를 던지면
						
					} catch(MyException e) {	// catch가 받을 수 있다
						
//						System.out.println("이미 입력된 데이터입니다");
//						System.out.println(e);
						e.printStackTrace();
						continue; 	// break의 반대. 반복문에서 위로 탈출하여 다시 반복문을 수행한다
					}
				}
				insert(arr, str);
			}
			// 배열 출력
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			sc.close();
			
		}
}
