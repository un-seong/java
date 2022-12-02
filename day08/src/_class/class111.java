package _class;

class gmarket {
	String name;
	int price;
	
	gmarket(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void show() {
		System.out.printf("%s %,d원\n", name , price);
	}
	
}

public class class111 {
	public static void main(String[] args) {
		gmarket g1 = new gmarket("블랙야크", 111200);
		gmarket g2 = new gmarket("바나나우유", 12900);
		gmarket g3 = new gmarket("백미", 23900);
		gmarket g4 = new gmarket("할로윈 사탕", 17300);
		gmarket g5 = new gmarket("햇반", 36470);
		gmarket g6 = new gmarket("맨투맨", 24000);
		
		gmarket[] arr = { g1, g2, g3, g4, g5, g6 };
		
		for(int i = 0; i <arr.length-1; i++) {
			for(int j = i+1; j <arr.length; j++) {
				if(arr[i].price>arr[j].price) {
					gmarket tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}		
		
		for(int i = 0; i < arr.length; i++) {
		arr[i].show();

		}
	}
}
