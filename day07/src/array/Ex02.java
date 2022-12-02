package array;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = 3;
		String[] arr = new String[length]; 
		String input;
		String[] tmp;
				
		show(arr);
				
		while(true) { 
			System.out.println("입력 하세요 : ");
			input = sc.nextLine();
			if(input.equals("")) {
				break;
			}
			for(int i = 0; i< arr.length; i++) {
				if(arr[i] == null) {
					arr[i] = input;
					break;
					}
				}
			
			show(arr);
			
			
			if(arr[arr.length-1] != null) {
				tmp = new String[arr.length + length];
				for(int i = 0; i<arr.length; i++) {
					tmp[i] = arr[i];
			}
			arr = tmp;

					
		}
		
		}System.out.println("끗");
		sc.close();
		
	}

	private static void show(String[] arr) {
		System.out.printf("arr[%s] : {", arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length -1? "}\n" : ",");
		}
	}
}
