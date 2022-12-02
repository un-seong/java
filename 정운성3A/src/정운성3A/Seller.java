package 정운성3A;

public class Seller extends Member {
	
	private String store;
	
	Seller(String id, String password, String name, String store){
		super(id, password, name);
		this.store = store;
	}
			
	@Override
	public void showInfo() {
		if(password != null) {
			password = "****";
		}
		System.out.printf("[판매자] ID : %s, 이름 : %s, 비밀번호 : %s [가게이름 : %s]\n", id, name, password, store);
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}
	
	
}
