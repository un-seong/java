package air;

public class Doctor extends Human {
	Doctor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	void heal(Human other) {
		System.out.println(this.name + " 이/가" + other.name + " 치료");
	}
	
	@Override
	void show() {
		System.out.println("의사 : " + this.name);
	}
}
