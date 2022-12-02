package airplane;

public class Doctor extends Human {
	
	Doctor(String name) {
		super(name);

	}
	
	@Override
	void show() {
		System.out.println("의사 : " + name);
	}
	
	void heal(Human other) {
		System.out.println(this.name + "이/가 " +
							other.name + " 을/를 치료");
	}
}
