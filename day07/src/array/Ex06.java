package array;

public class Ex06 {
	
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
		int[][] arr = new int [5][5];
		
		guide(arr);
		
		
		show(arr);
		
		int num = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ++ num; // arr[i][j] = i * 5 + j + 1과 같음
			}
		}
		show(arr);
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
//				boolean flag = i == 0 || i == 4 || j == 0 || j == 4;
//				arr[i][j] = flag ? 1 : 0;		// 바깥 쪽에만 1표시
				
//				boolean flag1 = i+j == 2 || i+j == 6 || i-j== -2 || i-j == 2; 
//				arr[i][j] = flag1 ? 1 : 0;		// 마름모 꼴 1 표시
				
			}
		}
		show(arr);
		
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i % 2 == 0) {
					arr[i][j] = i * 5 + j + 1; 
				}else {
					arr[i][j] = i * 5 - j + 5;
				}
			}
		}
		show(arr);
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
//				if(i % 2 == 0) {
//					tmp = j + 1; 
//				}else {
//					tmp = j - 5;
//				}
				int tmp = i %2 == 0 ? j + 1 : 5 - j ;
				arr[i][j] = i * 5 + tmp;
			}
		}
		show(arr);
		
		
		
		
	}
}
