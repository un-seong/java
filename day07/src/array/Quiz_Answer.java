package array;

public class Quiz_Answer {
	
	static void guide(int[][] arr) {
		for(int i =0; i< arr.length; i++) {
			for(int j= 0; j<arr[i].length; j++) {
				System.out.printf("(%d, %d) " , i,j);
			
			}
			System.out.println();
		}
		System.out.println();
	}
		
	static void show(int[][] arr) {
		for(int i =0; i< arr.length; i++) {
			for(int j= 0; j<arr[i].length; j++) {
				System.out.printf("%2d " , arr[i][j]);
			
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int length = 5;
		int[][] arr = new int[length][length];
		
		int num = 0;
		int x = 0 , y = -1;
		int sign = 1;
		guide(arr);
		
		while(true) {
			for(int i = 0; i< length; i++) {
				y += sign;
				arr[x][y] = ++num;
			}
			length--;
			if(length ==0) break;
			
			for ( int i = 0; i < length; i++) {
				x+= sign;
				arr[x][y] = ++num;
			}
			sign = -sign;	// 부호 반전 > 가이드를 보고 잘 생각 해보자 어디서 더해지고 어디서 빼지는지
		}
		show(arr);
		
		
		
// 	또는 
//		while(length > 0) {
//			for(int i = 0; i< length; i++) {
//				x += sign;
//				arr[y][x] = ++ num;
//			}
//			length--;
//			
//			for ( int i = 0; i < length; i++) {
//				y+= sign;
//				arr[y][x] = ++num;
//			}
//			sign = -sign;
//		}
//		show(arr);
		
		
		
		
		
		
		
		
//		for(int i = 0; i<length; i++) {
//			arr[0][i] = ++num;
//		}
//		length--;
////		arr[0][0] = 1;	arr[0][0] = ++num;
////		arr[0][1] = 2;	arr[0][1] = ++num;
////		arr[0][2] = 3;
////		arr[0][3] = 4;
////		arr[0][4] = 5;	
//		for(int i = 0; i< length; i++) {
//			arr[i+ 1][4] = ++num;
//		}
////		arr[1][4] = 6;
////		arr[2][4] = 7;
////		arr[3][4] = 8;
////		arr[4][4] = 9;			
//		for(int i = 0; i< length; i++) {
//			arr[4][3-i] = ++num;
//		}length--;
////		arr[4][3] = 10;
////		arr[4][2] = 11;
////		arr[4][1] = 12;
////		arr[4][0] = 13;
//		for(int i = 0; i< length; i++) {
//			arr[3-i][0] = ++num;
//		}
////		arr[3][0] = 14;
////		arr[2][0] = 15;
////		arr[1][0] = 16;
//		for(int i = 0 ; i< length; i++) {
//			arr[1][i+1] = ++ num;
//		}
////		arr[1][1] = 17;
////		arr[1][2] = 18;
////		arr[1][3] = 19;
//	 	length--;
//		
//	 	for(int i = 0 ; i<length; i ++) {
//	 		arr[i+2][3] = ++num;
//	 	}
////		arr[2][3] = 20;
////		arr[3][3] = 21;
//	 	for(int i = 0 ; i<length; i ++) {
//	 		arr[3][2-i] = ++num;
//	 	}
////		arr[3][2] = 22;
////		arr[3][1] = 23;
//	 	
//		for(int i = 0; i<length; i++) {
//			arr[2][1+i] = ++ num;
//		}
////		arr[2][1] = 24;
////		arr[2][2] = 25;
//		
//		length--;
//		show(arr);
		
	}
}
