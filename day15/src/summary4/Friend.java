package summary4;

public class Friend extends Human implements Food{
	
	Friend(String name) {
		super(name);
	}
	
	public String getFeed() {
		return "주먹밥";
	}

	@Override
	public String getName() {
		return name;
	}
	
}
