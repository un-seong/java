package collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		
		// Set은 크기가 있지만, index는 없다. 값의 중복을 허용하지 않는다		
		Set<Integer> set = new HashSet<Integer>();
				
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
				
		System.out.println("set의 크기 : " + set.size());
//		set.get(0);		// index를 이용해서 특정 값을 불러올 수 없다
		
		System.out.println(set);
		
//		for(int i = 0; i < set.size(); i++) {
//			index를 이용한 반복문을 사용할 수 없다면?	
//		}
		
		for(Integer num : set) {	// set 언애 들어있는 각 원소를 Integer 타입의 num에 저장해서
			System.out.println(num);// 각 정수를 화면에 출력한다			
		}
		
		Iterator<Integer> it = set.iterator();	// 반복
		while(it.hasNext()) {					// sc.hasNext();
			Integer num = it.next();			// sc.next();
			System.out.println("num : " + num);
		}
		
		
		
		
		
	}
}
