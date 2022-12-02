package airplane;

public class Doctor extends Human {
	void heal(Human other) {
		System.out.println(other.name + "치료");
	}
}
