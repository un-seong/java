package dddddddddd;

import java.util.Scanner;

public class zzzzzz {
	
	private static void show(String[] arr) {
		System.out.printf("arr[%s] : {", arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length -1? "}\n" : ",");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = 3;
		String[] arr = new String[length]; 
		String input;
		
		int i = 0;

		show(arr);
		
		
		input = sc.nextLine();
		System.out.println(input == null);
		System.out.println(input == "");
		System.out.println(input.equals(null));
		System.out.println(input.equals(""));
		
		
	
	}
}
