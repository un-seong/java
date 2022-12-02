package summary3;

public class Dog extends Animal {
	Dog(String name) {
		super(name);
	}
	
	@Override
	String getFeed() {
		return "개껌";
	}
}
