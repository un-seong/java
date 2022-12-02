package summary5;

public class Human {
	String name;
	
	Human(String name) {
		this.name = name;
	}

	public void give(Food f1) {
		String method = "";
		
		if(f1 instanceof Animal) {
			method = "던져";
		}
		if(f1 instanceof Human) {
			method = "건네";
		}
		
		System.out.println(this.name + "이 " + f1.getName() + "에게 "+ f1.getFeed() +"를 " +method + " 준다");
		
	}
	
	
}
