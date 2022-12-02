package 정운성3A;

public abstract class Member {
	// 필드
	String id;
	String password;
	String name;
	
	// 생성자
	Member(String id, String password, String name){
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	// 추상메서드
	public abstract void showInfo();

	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
		
	
}
