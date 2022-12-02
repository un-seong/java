package array;

public class Ex07 {
	
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
		int [][] arr = new int[5][5];
		guide(arr);
		show(arr);
	
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j % 2 == 0)	{
					arr[i][j] = j * 5 + i + 1;
				}else {
					arr[i][j] = j * 5 - i + 5;
				}
			}

		}
		show(arr);		
		
		
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int tmp = j % 2 == 0 ? j+1 : 5-j;
				arr[j][i] = i*5 + tmp;
				

			}

		}

		
	}
}
