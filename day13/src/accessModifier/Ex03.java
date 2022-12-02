package accessModifier;

class Food {
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Food() {
		
	}

	// private 필드의 getter / setter를 자동으로 작성하기
	// source - generate getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class Ex03 {
	public static void main(String[] args) {
		// 클래스 Food를 이용하여 서로 다른 음식의 객체를 2개 생성하고
		// 각 객체의 이름과 가격을 printf()를 이용하여 같은 서식으로 출력하세요
		Food fd1 = new Food();	// 비어 있는 객체, 값을 담을 수는 있지만 아직 없음
		Food fd2 = new Food();
		
//		System.out.println(fd.toStr());
//		System.out.println(fd1.toStr());
	

		fd1.setName("치킨");		// fd1.name = "치킨";
		fd1.setPrice(20000);	// fd1.price = 20000;
		
//		System.out.println(fd1.name);
		System.out.println(fd1.getName());
//		System.out.println(fd1.price);
		System.out.println(fd1.getPrice());
		
		fd1 = new Food("치킨", 20000);
		fd2 = new Food("떡튀순", 15000);
		
		System.out.printf("%s : %,d원\n", fd1.getName(), fd1.getPrice());
		System.out.printf("%s : %,d원\n", fd2.getName(), fd2.getPrice());
		
	}

	


}
