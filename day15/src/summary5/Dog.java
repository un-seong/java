package summary5;

public class Dog extends Animal implements Food{
	Dog(String name) {
		super(name);
	}
	
	@Override
	public String getFeed() {
		return "개껌";
	}
	
	@Override
	public String getName() {
		return name;
	}
}
