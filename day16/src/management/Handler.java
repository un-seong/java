package management;

import model.ComputerScieneceStudent;
import model.EnglishLinguisticStudent;
import model.Student;

public class Handler {
	
	private Student[] arr = new Student[10];
	
	// 목록
	public void showList() {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] != null) {
				System.out.print(i+1 + ") ");
				arr[i].showInfo();
			}
		}
	}
	
	// 추가
	int insert(Student st) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null && st instanceof EnglishLinguisticStudent) {
				arr[i] = st;
				return 1;
			}
			if(arr[i] == null && st instanceof ComputerScieneceStudent) {
				arr[i] = st;
				return 2;
			}
		}return 0;
	}
	
	// 검색
	public Student find(String name) {	// 배열을 다룰때에는 배열의 자료형을 확인하고 진행하자
		for(int i = 0; i < arr.length; i++) {	// 학생의 배열이므로, 각 배열의 칸에는 학생 객체가 담길 수 있다
			if(arr[i] !=null && arr[i].getName().equals(name)) {	// 빈칸이 아닌 곳의 학생의 이름이 전달받은 이름과 일치하면
				return arr[i];	// 그 학생 객체를 반환한다
			}
		}
		return null;
	}
	
	// 삭제
	
	public int delete(Student st) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == st) {	// == 연산자는  NullPointerException 을 발생시키지 않는다
				arr[i] = null;	// . 왼쪽이 null이면 NullPointerException 이 발생한다
				return 1;
			}
		}
		return 0;
	}
	
//	public int delete(Student st) {
//		for(int i = 0; i< arr.length; i++) {
//			if(arr[i] != null && arr[i].getName().equals(st.getName())) {
//				arr[i] = null;
//				return 1;
//			}
//		}
//		return 0;
//	}

	// find는 객체를 반환하지만, indexOf는 객체가 위치하는 배열의 index를 반환하게 만든다
	public int indexOf(String name) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] != null && arr[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public int delete(int index) {
		if(arr[index] != null) {	// index 번째에 객체가 있으면
			arr[index] = null;		// 객체를 제거하고
			return 1;				// 1을 반환
		}
		return 0;	// if를 만족하지 않으면 0을 반환
	}
	
	
}
