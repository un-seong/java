package Ex02;

public class Handler {

	// 목록, 추가, 단일검색(이름), 수정, 삭제
	Student[] arr = new Student[5];
	
	
	String search(String find) {
		String result = "";
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(find)) {
				result = arr[i].toString();
			}
		}
		return result;
	}
	
	String studentAll() {
		String result = "";
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] != null) {
				result += (i+1)+"] ";
				result += arr[i].toString();
			}
		}
		return result;
	}

	
	int insert(Student st) {
		for(int i = 0; i < arr.length; i++)
			if(arr[i] == null) {
				arr[i] = st;
				return 1;
			}
		return 0;			
	}

	public int sdelte(String delete) {
		String result = null;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(delete)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}

	public int update(String find, int kor, int eng, int mat) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(find)) {	// 이름이 같으면
				arr[i].kor = kor;				// 국어 영어 수학 점수를 새로 대입하고
				arr[i].eng = eng;
				arr[i].mat = mat;
				arr[i].sum = kor+eng+mat;		// 합계와 평균도 다시 계산하여 넣어줌
				arr[i].avg = arr[i].sum/3.0;				
				return 1;
			}
		}
		
		
		return 0;
	}


	
}
