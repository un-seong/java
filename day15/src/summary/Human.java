package summary;

public class Human {
	String name;
	
	Human(String name) {
		this.name = name;
	}

	public void give(Cat c1) {
		System.out.println(this.name + "이 " + c1.name + "에게 먹이를 준다");
		
	}
	
	public void give(Dog d1) {
		System.out.println(this.name + "이 " + d1.name + "에게 먹이를 준다");
		
	}
}
