package array;

public class Quiz {
	
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
		int[][] arr = new int[5][5];
		guide(arr);
		show(arr);
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				if(i==0)	{
					arr[i][j] = i * 5 + j + 1;
				}else if(j==4) {
					arr[i][j] = i + 5;
				}else if(i==4) {
					arr[i][j] = i * 5 - j - 7;
				}else if(j==0) {
					arr[i][j] = j + 17 - i;
				}else if(i==1) {
					arr[i][j] = i * 5 + j + 11;
				}else if(j==3) {
					arr[i][j] = i + 20 - j + 1;
				}else if(i==3) {
					arr[i][j] = i * 5 - j + 9;
				}else{
					arr[i][j] = i * 10 + j + 3;
				}
			}
		}
		show(arr);
		
	}
}
