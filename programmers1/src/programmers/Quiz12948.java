package programmers;

public class Quiz12948 {
	public static void main(String[] args) {
		String phone_number = "01033334444";
//		String phone_number = "027778888";
		String answer = "";
		
		String back = "";
		String front = "";
	
		
		if(phone_number.length() > 4 && phone_number.length() <20) {
			for(int i = 0; i< phone_number.length()-4; i++) {
				front += "*";
			}
		}
		answer += front;
		answer += phone_number.substring(phone_number.length()-4);
		
		System.out.println(answer);
		
		
		
//		
//		if(phone_number.length() > 4 && phone_number.length() <20) {
//			for(int i = 0; i < phone_number.length()-4; i++) {
//				answer += phone_number.replace(phone_number, "*");
//			}
//			answer += phone_number.substring(phone_number.length()-4);
//		}
//		
		

		

		
//		if(phone_number.length() == 11) {
//			String result = phone_number.substring(0, 7);
//			for(int i = 0; i < phone_number.length()-4; i++) {
//				String result1 = result.replace(result, "*");
//				answer += result1;
//			}
//			String result2 = phone_number.substring(7);
//			answer += result2;	
//		}
//		
//		else {
//			String result = phone_number.substring(0, 5);
//			for(int i = 0; i < phone_number.length()-4; i++) {
//				String result1 = result.replace(result, "*");
//				answer += result1;
//			}
//			String result2 = phone_number.substring(5);
//			answer += result2;	
//		}
//		
//		System.out.println(answer);
	


		
		
		
		
		
		
		
		
	}
}
