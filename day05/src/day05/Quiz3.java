package day05;

public class Quiz3 {
	
	static int min(int a, int b, int c) {
		int v = a;
		if (b<v) {
			v = b;
		}
		if (c<v) {
			v = c;
		}
		return v;
	}
	
	
//	// 해답
//	static int min(int...args) {
//		int ret = 1000000;
//	
//		for(int i = 0; i <args.length; i++) {
//			int num = args[i];
//			if(ret > num) {
//				ret = num;
//				}
//		
//			}
//		System.out.println(ret);
//		return ret;
//	}	

	static int count(String str, char ch) {
		int cnt = 0;
		for(int i = 0; i <str.length(); i++) {
			char current = str.charAt(i);
			if(current == ch) { // ch와 current의 자료형은 char(primitive)
				cnt++;
			}
		}
		return cnt;
	}

	
	static boolean check(String a) {
		boolean flag = false;
		// 1) 길이가 일치하는가?
		if(a.length()==19) {
			flag = true;
		}
		
		// 2) -의 개수가 일치하는가? ( 함수 재사용 )
		if(count(a,'-') != 3)
			flag = false;
		
		// 3) split으로 분리했을 때, 분리된 요소가 4개인가?
		String[] arr = a.split("-");
		if(arr.length != 4)
			flag = false;
			
		// 4) split으로 분리했을 때, 각 요소의 자릿수가 4인가?
		for(int i= 0; i< arr.length; i++) {
			String s = arr[i];
//			System.out.println("s : "+ s);
			if (s.length() != 4)
				flag = false;
		}
		
		return flag;
	}
		
	
	
	
	
	public static void main(String[] args) {
		// 1) 정수를 여러개 전달 받아서, 최대값을 반환하는 함수를 작성하세요
		int n1 = min(5, 1, 2);
		System.out.println("n1 : " + n1);
		
//		// 2) 문자열에서 특정 글자가 몇개 포함되어 있는지 반환하는 함수를 작성하세요
		int n2 = count("Life is too short, you need python", 'e');
		System.out.println("n2 : " + n2);
//		
//		// 3) 문자열 형태로 카드번호를 입력받아서, 길이가 맞는지 확인하는 함수를 작성하세요
//		// 전체길이, -의 개수, 분리했을때 각 단위의 길이
		boolean b1 = check("1234-1234-1234-1234"); 	// true
		boolean b2 = check("867-2356123-1234567");	// false
		boolean b3 = check("930516-2345678");		// false
		boolean b4 = check("3456-1255-6-1234558"); // false
		System.out.printf("%b, %b, %b, %b\n", b1, b2, b3, b4);


	}
}


