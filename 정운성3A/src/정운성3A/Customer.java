package 정운성3A;

public class Customer extends Member {
	
	private String address;
	
	Customer(String id, String password, String name, String address){
		super(id, password, name);
		this.address = address;
	}
		
	@Override
	public void showInfo() {
		if(password != null) {
			password = "****";
		}
		System.out.printf("[구매자] ID : %s, 이름 : %s, 비밀번호 : %s [배송주소 : %s]\n", id, password, name, address);
		
		
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
