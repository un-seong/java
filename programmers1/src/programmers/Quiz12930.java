package programmers;

public class Quiz12930 {
	public static void main(String[] args) {
		String s = "     try hello world";
		String[] s1 = s.split(" ");
		String answer = "";
		
		
//		System.out.println(s.substring(0,3));
//		System.out.println(s.substring(4,9));
//		System.out.println(s.substring(10,15));
		int count = 0;
		
				
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {				
				count = 0;				
			}
			else {
				count++; 
			}
			if(count % 2 == 0 ) {
				answer += (s.charAt(i)+"").toLowerCase();
			}else {
				answer += (s.charAt(i)+"").toUpperCase();
			}
			
		}
		
		
		
		answer += " ";
				
		System.out.println(answer);
		
//		System.out.print(s1[0].substring(0,1).toUpperCase());
//		System.out.print(s1[0].substring(1,2));
//		System.out.print(s1[0].substring(2,3).toUpperCase()+ " ");
//		
//		System.out.print(s1[1].substring(0,1).toUpperCase());
//		System.out.print(s1[1].substring(1,2));
//		System.out.print(s1[1].substring(2,3).toUpperCase());
//		System.out.print(s1[1].substring(3,4));
//		System.out.print(s1[1].substring(4,5).toUpperCase()+ " ");
//		
//		
//		System.out.print(s1[2].substring(0,1).toUpperCase());
//		System.out.print(s1[2].substring(1,2));
//		System.out.print(s1[2].substring(2,3).toUpperCase());
//		System.out.print(s1[2].substring(3,4));
//		System.out.print(s1[2].substring(4,5).toUpperCase());
		
		


		
		
		
//		   String answer = "";
//	        String[] s1 = s.split(" ");
//	        int cnt = 0;
//			int count = 0;
//			int a = 0;
//	        int b = 0;
//					
//			while(cnt != 3) {
//				for(int i = 0; i < s1[a].length(); i++) {
//					count++;
//					if(count % 2 == 0 ) {
//						answer += s1[a].substring(i,count);
//					}else {
//						answer += s1[a].substring(i, count).toUpperCase();
//					}
//				}
//	            
//				cnt++;
//				count = 0;
//				a++;			
//			}
		
		
		
		
	}
	
}
