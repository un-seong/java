package collection;

import java.util.Comparator;

class MyIntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}
}

public class Ex08 {
	public static void main(String[] args) {
		Integer[] arr = { 2, 7, 8, 4, 6 };
		showArray(arr);
		
		MyIntegerComparator cmp = new MyIntegerComparator();
		
//		list.sort(cmp);	// list는 this, 0번째 매개변수
		mySort(arr, cmp);
		showArray(arr);
	}
	
	static void mySort(Integer[] arr, MyIntegerComparator cmp) {
		// 배열의 선택정렬
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				
				if(cmp.compare(arr[i], arr[j]) > 0) {	// 이걸 쓰나 아래꺼 쓰나
//				if(arr[i] > arr[j]) {			// 이걸 쓰나 위에껄 쓰나 똑같음
					Integer tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	static void showArray(Integer[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i != arr.length - 1 ? ", " : "]\n");
		}
		System.out.println();
	}
}
