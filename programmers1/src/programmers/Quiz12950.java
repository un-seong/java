package programmers;

public class Quiz12950 {
	public static void main(String[] args) {
		int[][] arr1 = new int [2][2];
		int[][] arr2 = new int [2][2];
		int[][] answer = null;
		
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr2[0][0] = 2;
		arr2[0][1] = 4;
		
		arr1[1][0] = 3;
		arr1[1][1] = 3;
		arr2[1][0] = 4;
		arr2[1][1] = 6;
		
		System.out.println(arr1[0].length);
		
		 if (arr1.length <= 500) {
	            int row = arr1.length;
	            int col = arr1[0].length;

	            answer = new int[row][col];

	            for (int i=0; i<row; i++) {
	                for (int j=0; j<col; j++) {
	                    answer[i][j] = arr1[i][j] + arr2[i][j];
	                }
	           }
	       }
		

	}
}
