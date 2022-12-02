package programers;

import java.util.ArrayList;

public class Quiz64061_1 {

	// 코딩테스트 연습 -> 2019 카카오 개발자 겨울 인턴십 -> 크레인 인형뽑기 게임

		static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        // moves를 참조하여 인형을 순서대로 뽑아서 출력하기
	        ArrayList<Integer> basket = new ArrayList<Integer>();
	        
	        for(int i = 0; i < moves.length; i++) {		// 슬롯 번호대로 반복한다
	        	int doll = 0;							// 뽑은 인형을 저장할 변수
	        	int index = moves[i] -1;				// 인덱스는 슬롯 번호 -1
	        	for(int j = 0; j < board.length; j++) {	// 보드의 길이(줄 수)만큼 반복
	        		if(board[j][index] != 0) {			// j번째 줄의 index번째 슬롯에 인형이 있으면
	        			doll = board[j][index];			// 인형을 doll에 저장하고
	        			board[j][index] = 0;			// 인형을 뽑았으니, 원래 위치에는 0을 대입하고
	        			break;							// 인형 하나 찾았으면 반복을 중단
	        		}
	        	}     
	               	
	           	System.out.print(doll + " ");		// 뽑은 인형을 화면에
	           	
	           	if(doll !=0) {						// 뽑은 인형이 있으면 (0이 아니면)
	           		basket.add(doll);					// 인형을 바구니에 담는다
	           	}
	           	int size = basket.size();
	           	if(size >= 2 && basket.get(size -1) == basket.get(size-2)) {	
	           		System.out.println("중복된 인형 터트리기");
	           		basket.remove(size-1);
	           		basket.remove(size-2);
	           		answer += 2; 
	           		}
	            System.out.println(basket);           	
	        }
	        System.out.println();
	        return answer;
	    }
			
		public static void main(String[] args) {
			int[][] board = {
					{0, 0, 0, 0, 0},
					{0, 0, 1, 0, 3}, 
					{0, 2, 5, 0, 1}, 
					{4, 2, 4, 4, 2}, 
					{3, 5, 1, 3, 1}
			};
			int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
			int answer = solution(board, moves);
			System.out.println(answer == 4);
				
			
		}
	}

