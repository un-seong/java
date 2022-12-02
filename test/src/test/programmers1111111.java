package test;

import java.util.Arrays;

public class programmers1111111 {
	    public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        Arrays.sort(participant);  // 두 배열을 정렬한다
	        Arrays.sort(completion);
	        
	        answer = participant[participant.length -1];    // 어차피 정답은 마지막 참가자
	        
	         for(int i = 0; i < completion.length; i++) {   // 완주자의 목록을 순서대로 조회 하면서   
	        		if(completion[i].equals(participant[i])==false) {   // 만약 참가자가 완주자가 아니라면,
	                    answer = participant[i];                        // 그 참자자가 정답이다 (완주하지 못한 선수)
	                    break;                                          // 정답을 찾았으니, 반복을 중단한다
	                }
	         }
	        return answer;
	    }

	    
		
		public static void main(String[] args) {
			String[] p1 = {"leo", "kiki", "eden"};
			String[] c1 = {"eden", "kiki"};
			
			String[] p2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
			String[] c2 = {"josipa", "filipa", "marina", "nikola"};
			
			String[] p3 = {"mislav", "stanko", "mislav", "ana"};
			String[] c3 = {"stanko", "ana", "mislav"};
			
			System.out.println(solution(p1, c1).equals("leo"));
			System.out.println(solution(p2, c2).equals("vinko"));
			System.out.println(solution(p3, c3).equals("mislav"));
			
			
					
				}
			
		}

