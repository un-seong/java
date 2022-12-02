package movie;

public class Handler {

	static Movie[] arr = new Movie[10];
	
	static String getList() {	// 목록
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += (i+1) + ") ";
				result += arr[i].getInfo();
				result += "\n";	
			}
		}
		return result;
	}
	
	static String getDetail() {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += arr[i].getDetail();
			}
		}
		return result;
	}
	
	static String search(String keyword) {	// 검색
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getDetail().contains(keyword)) {
				// i 번째 칸이 빈칸이 아니고, i번째 요소의 내용에 keyword가 포함되어 있으면
				result = arr[i].getDetail();
				break; // 원하는 요소를 하나 찾았다면 더이상 반복하지 않는다

//				arr[i].title.equals(keyword);  //< 내가 쓴것. 이상하게 나옴 boolean 값을 가지고 옴
				
			}			
		}
		return result;
	}
	
	static int insert(Movie ob) {	// 추가
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]== null) {
				arr[i]=ob;
				return 1;
			}
		}
		return 0;
	}
	
	static int delete(int idx) {	// 삭제 - 번호
		if(arr[idx -1] != null) {
			arr[idx -1] = null;
			return 1;
		}
		return 0;
	}
	
	static int delete(String keyword) {	// 삭제 - 키워드
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] != null && arr[i].title.equals(keyword)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
		
	}

	public static String update(String find, String name) {
		String result = null;
		for(int i = 0 ; i < arr.length; i++ ) {
			if(arr[i] != null && arr[i].title.equals(find)) {
				arr[i].title = name;
				return result = name;
			}
				
		}
		return result;
	}
	
	

	
}
