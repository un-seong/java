package programmers;

public class Quiz12918 {
	public static void main(String[] args) {
		String s = "a234";
		String s1 = "1234";
		
		boolean answer = true;
		
		if(s.length() != 4 && s.length() != 6) {
			answer = false;
		}
		s = s.toLowerCase();
		System.out.println(s);
			
		for(char i = 'a'; i <= 'Z'; i++) {
			String str = String.valueOf(i);
			if(s.contains(str)) {
				answer = false;
			}
		}		
								
		System.out.println();		
		System.out.println(answer);
	}
}


//	String[] arr = { "a", "b", "c", "d", "e", "f" };

//	for(int i = 0; i < arr.length; i++) {
//		if(s.contains(arr[i])) {
//			answer = false;
//		}
//	}

