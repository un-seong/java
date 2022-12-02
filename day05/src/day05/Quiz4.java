package day05;

public class Quiz4 {
	
	static String profile(long data) {
		String result = "";
		// 7번째 숫자가 홀수인가 짝수인가?
//		String s = String.valueOf(data);
//		System.out.println(s);
//		
//		char a = s.charAt(6);
//		System.out.println("a : "+ a);
//		if (a % 2 ==0) {
//			System.out.println("여성");
//		}
//		else {
//			System.out.println("남성");
//		}
		
		// 앞에 두 자리를 구한 후 나이를 계산하라
		
		
		return result;
	}
	
	
	static String profile(String data) {
		String result = "";
					
		char gender = data.charAt(7);
		
		String[] arr = data.split("-");
		String age = arr[0].substring(0, 2);
		
		int age1 = Integer.parseInt(age);
		
		if (gender >= 2) {
			age1 = 2020 - (2000 + age1) + 1;
		}
		else {
			age1 = 2020 - (1900 + age1);
		}
						
		if(gender % 2 == 0) {
			String gender1 = "여성";
			System.out.printf("%d세, %s입니다", age1, gender1);
		}
		else {
			String gender2 = "남성";
			System.out.printf("%d세, %s입니다.", age1, gender2);
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		// 주민등록번호를 전달받아서 나이와 성별을 출력하는 함수를 작성하세요
		// 인자는 정수 혹은 문자열로 전달할 수 있습니다
		// 결과는 String.format을 이용하여 나이, 성별을 문자열형식으로 반환합니다
		
		String s1 = profile(9305162345678L);			// long
		String s2 = profile("000516-4345678");		// String
		
		System.out.println(s1); // 30세, 여성입니다
		System.out.println(s2);	// 30세, 여성입니다
	}
}



