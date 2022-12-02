package summary4;

public class Cat extends Animal implements Food{
	Cat(String name) {
		super(name);
	}
	
	@Override
	public String getFeed() {
		return "츄르";
	}
	
	@Override
	public String getName() {
		return name;
	}
}
