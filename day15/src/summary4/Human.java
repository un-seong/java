package summary4;

public class Human {
	String name;
	
	Human(String name) {
		this.name = name;
	}

	public void give(Food f1) {
		System.out.println(this.name + "이 " + f1.getName() + "에게 "+ f1.getFeed() +"를 준다");
		
	}
	
	
}
