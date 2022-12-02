package test;

public class ddddd {
	public static void main(String[] args) {
		int width = 6;
		int height = 8;
		
		
		for(int i = 0; i<=width; i++) {
			for(int j = 0; j<=height; j++) {
				if(i==0 || i==width || j==0 || j==height) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		}
	}
	
