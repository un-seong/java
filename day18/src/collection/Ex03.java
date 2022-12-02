package collection;

import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		// map : 배열의 index 대신, key를 이용하여 value에 접근하는 자료구조
		// key는 중복될 수 없고, value는 중복될 수 있다
		// arr[i]형식으로 배열의 각 값에 접근하는 것 처럼
		// map[key] 형식으로 접근한다. 단, 배열처럼 쓰지는 않고, 함수를 이용하여 값에 접근한다
		Hashtable<String, Object> map = new Hashtable<String, Object>();
		
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("sc", new Scanner(System.in));
		map.put("f", new File("a.txt"));
		
		
		System.out.println(map.remove("apple"));
		
		System.out.println(map.containsKey("apple"));
		
		System.out.println("map의 크기 : " + map.size());
		
		System.out.println(map.get("apple"));	// map["apple"]
		System.out.println(map.get("banana"));	// map["banana"]
		// key를 이용하여 value에 접근할 수 있지만, value를 이용하여 key에 접근 하지는 않는다
		// key와 value는 양방향 mapping이 아니다. key -> value (O), vlaue -> key(X)
		System.out.println(map.get("사과"));	// 양방향이 아니라 key값 입력 시 null이 뜸
		
		// map을 이용하여 내부의 모든 값을 출력하는 예시
		// 1) for
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			Object value = map.get(key);
			System.out.printf("%s: %s\n", key, value);
		}
		System.out.println();
		
		// 2) Iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			Object value = map.get(key);
			System.out.printf("%s: %s\n", key, value);
		}
		System.out.println();
		
		
		// 3) Enumeration
		Enumeration<String> enu = map.keys();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			Object value = map.get(key);
			System.out.printf("%s: %s\n", key, value);
		}
		System.out.println();
		
		// 4) EntrySet
		for(Entry<String, Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.printf("%s: %s\n", key, value);
		}
		System.out.println();
		
		
	}
}
