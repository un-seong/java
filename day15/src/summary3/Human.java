package summary3;

public class Human {
	String name;
	
	Human(String name) {
		this.name = name;
	}

	public void give(Cat c1) {
		System.out.println(this.name + "이 " + c1.name + "에게 "+ c1.getFeed() +"를 준다");
		
	}
	
	public void give(Dog d1) {
		System.out.println(this.name + "이 " + d1.name + "에게  "+ d1.getFeed() +"를 준다");
		
	}
}
