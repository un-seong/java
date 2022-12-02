package day06;

public class Ex02 {
	public static void main(String[] args) {
		
		// 배열 만들기
		// 1) 배열은 Reference Type이고, 변수는 대상을 참조하는 변수이다(본체가 아니다)
		
		int[] arr1; // 정수형 배열을 참조할 수 있는 참조변수만 선언 (실제 배열은 없음)
		int arr2[]; // C언어에서는 변수이름 뒤에 []를 작성해야만 한다 (자바는 둘다 가능)
		
		int[] arr3 = { 2, 7, 8, 4, 6 };
		// primitive type이거나, 다른 변수가 만들어져 있으면 중괄호만으로 생성 가능
		
		int[] arr4 = new int[] { 10, 20, 30, 40, 50 };
		// 객체의 배열을 생성하기 위해서는 위와 같이 new 자료형[] 형식으로 생성 가능
		
		int[] arr5 = new int[5];
		// 배열의 요소를 명시하지 않고, 빈칸만으로 배열을 생성할 수도 있으며, 길이가 필요함
		// 이때, 배열 멤버 요소의 초기값은 자료형에 맞는 0값으로 생성됨 > 값을 지정 안했기 때문
		
//		int[] arr6 = new int[5] { 1, 2, 3, 4, 5 };
		// 배열을 생성할 때는 길이 혹은 요소를 명시하며, 둘다 명시하면 문법상 틀림
		
		System.out.println(arr3); // 특정 객체를 참조하기 때문에, 객체의 hashcode가 출력됨	
		showArray(arr3);
		
		showArray(arr5);
		
		// 2) 배열을 가리키는 변수는 참조타입이므로, 다른 대상을 참조할 수 있다
		int [] test = { 1, 2, 3 };
		showArray(test);
		
		test = arr4;
		showArray(test);	// 바라보는 참조 타입이 바뀜
		
	}
	
	static void showArray(int[] arr) {
		for(int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	}
}
