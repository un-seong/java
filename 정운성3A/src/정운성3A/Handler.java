package 정운성3A;

public class Handler {
	
	Member[] arr = new Member[100];

	// 추가
	public int insert(Member mb) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null && mb instanceof Customer) {
				arr[i] = mb;
				return 1;
			}
			if(arr[i] == null && mb instanceof Seller) {
				arr[i] = mb;
				return 2;
			}
			if(arr[i].id.equals(mb.id)) {
				System.out.println("\t중복된 아이디가 존재합니다");
				break;				
			}
		}
		return 0;
	}
	
	//	삭제
	public int delete(String id) {
		for(int i = 0; i< arr.length; i++ ) {
			if(arr[i] != null && arr[i].id.equals(id)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
	
	// 전체 보기
	public void listAll() {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] != null) {
				System.out.print(i+1 + ") ");
				arr[i].showInfo();
			}
		}
	}

	// 단일 검색
	public Member find(String id) {		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] != null && arr[i].id.equals(id)) {
				arr[i].showInfo();
				return arr[i];
			}			
		}
		return null;
	}
}
