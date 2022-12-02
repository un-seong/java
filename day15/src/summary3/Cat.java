package summary3;

public class Cat extends Animal{
	Cat(String name) {
		super(name);
	}
	
	@Override
	String getFeed() {
		return "츄르";
	}
}
