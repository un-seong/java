package card;

public class Card {
	char type;	// 다이아, 스페이드, 클로버, 하트
	char num;	// A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
	
	int width = 20;	// 카드의 너비
	int height = 15;	// 카드의 높이
	
	Card(char type, char num) { // 생성자
		this.type = type;
		this.num = num;	
		
	}
	
	void show() { // 카드 출력 함수 
		for(int i = 0; i <height; i++) {
			for(int j = 0; j<width; j++) {
				if(i == 0 && j== 0) {
					System.out.print("┌");
				}
				else if(i==height -1 && j==0) { 
					System.out.print("└");
				}
				else if (i == 0 && j == width -1) {
					System.out.print("┐");
				}
				else if(i == height -1 && j == width -1) {
					System.out.print("┘");
				}
				else if (j==0 || j==width -1) {
					System.out.print("│");
				}
				else if(i == 0 || i == height -1) {
					System.out.print("──");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();		
		}
		System.out.println();
	}
		
}

