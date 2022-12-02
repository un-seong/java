package programmers;

public class Quiz42889 {
	public static void main(String[] args) {
		int n = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		
		int[] answer = {};
			
		// 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수 
		//					
		// 1. 각 스테이지마다 실패율 구함
		// 2. 실패율을 바탕으로 스테이지 넣음
		int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;
		
		double faile1 = 0, faile2 = 0 , faile3 = 0, faile4 = 0, faile5 = 0;
		
		// s1 = 1/8
		// s2 = 3/7
		// s3 = 2/4
		// s4 = 1/2
		// s5 = 0/1		// 총인원 - 스테이지에 도달한 인원
					
		for(int i = 0; i< stages.length; i++) {
			if(n-4 == stages[i]) {
				s1++;
				faile1 = s1 / stages.length;
			}
			if(n-3 == stages[i]) {
				s2++;
				faile2 = s2 / (stages.length - s1);
			}
			if(n-2 == stages[i]) {
				s3++;
				faile3 = s3 / (stages.length - s1 - s2);
			}
			if(n-1 == stages[i]) {
				s4++;
				faile4 = s4 / (stages.length - s1 - s2 - s3);
			}
			if(n+1 == stages[i]) {
				s5 = 0;
				faile5 = 0;
			}
			
		}
		
						
		// 각 스테이지에 도달한 인원
		System.out.println(s1);	// 1
		System.out.println(s2);	// 3
		System.out.println(s3);	// 2
		System.out.println(s4);	// 1
		System.out.println(s5);	// 0
				
		// 실패율
		System.out.println("실패율1 : " + faile1 * 100);
		System.out.println("실패율2 : " + faile2 * 100);
		System.out.println("실패율3 : " + faile3 * 100);
		System.out.println("실패율4 : " + faile4 * 100);
		System.out.println("실패율5 : " + faile5 * 100);
		
	}
}
