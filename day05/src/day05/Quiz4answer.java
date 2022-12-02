package day05;

public class Quiz4answer {
	
	static String profile(long data) {	// long을 받는 profile과
		String result = "";				// String을 받는 profile은 서로 다른 함수이다
		long a = data / 10000000;
		long b = data % 10000000;
//		System.out.println(a + "-"+ b);
		result = profile(a + "-"+ b); // 이미 작성한 profile을 활용하여 형태만 맞춰준다
		return result;
	}
		
	static String profile(String data) {
		String result = "";
		String y = data.substring(0, 2); // 생년 월일
		String g = data.substring(7, 8); // 주민 뒷번호 제일 앞
		
		int year = Integer.parseInt(y);
		int gender = Integer.parseInt(g);
		int currentYear = 2022;
		
//		year += (year < 22 ) ? 2000 : 1900;
		switch(gender) {
		case 9: case 0:
			year += 1800;
			break;
		case 1: case 2:
			year +=1900;
			break;
		case 3: case 4:
			year += 2000;
			break;
		}
		int age = currentYear - year + 1;
		
		String format = "%d, %s 입니다";
		result = String.format(format, age, gender %2 == 0 ? "여성" : "남성");					
		return result;
	}	
	
	
	public static void main(String[] args) {
				// 주민등록번호를 전달받아서 나이와 성별을 출력하는 함수를 작성하세요
				// 인자는 정수 혹은 문자열로 전달할 수 있습니다
				// 결과는 String.format을 이용하여 나이, 성별을 문자열형식으로 반환합니다
				
				String s1 = profile(9305162345678L);			// long
				String s2 = profile("930516-4345678");		// String
				
				System.out.println(s1); // 30세, 여성입니다
				System.out.println(s2);	// 30세, 여성입니다
				
				String s3 = profile("010203-3456789");
				String s4 = profile(1112234567890L);
				
				System.out.println(s3);
				System.out.println(s4);
	}
}
