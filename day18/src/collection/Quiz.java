package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Quiz {
	public static void main(String[] args) {
		String json = "[";
		json += "{\"name\": \"강하늘\", \"pnum\": \"010-2323-2323\"}";
		json += ",";
		json += "{\"name\": \"홍진호\", \"pnum\": \"010-2222-2222\"}";
		json += "]";
		
//		String test = "say \"Hello\" !! ";
//		System.out.println(test);
		
		// ArrayList와 HashMap을 이용하여, 위 문자열에서 데이터만 추출하여
		// 객체 형식으로 저장하고 출력하세요
		// split, replace, trim 등의 문자열 함수를 적극적으로 활용하세요
			
		System.out.println(json);
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		
		String[] str = json.split(",");

		String result = str[0].substring(11,14);
		System.out.println("result : " + result);
		
		String result1 = str[1].substring(10,23);
		System.out.println("result1 : " + result1);
	
		String result2 = str[2].substring(10,13);
		System.out.println("result2 : " + result2);
		
		String result3 = str[3].substring(10,23);
		System.out.println("result3 : "+ result3);		
		
		HashMap<String, String> p1 = new HashMap<String, String>();
		p1.put("name", result);
		p1.put("pnum", result1);
		
		HashMap<String, String> p2 = new HashMap<String, String>();
		p2.put("name", result2);
		p2.put("pnum", result3);
			
		list.add(p1);
		list.add(p2);
		
		System.out.println(list);
		
//		System.out.println(p1.get("name"));
//		System.out.println(p1.get("pnum"));
//		System.out.println(p2.get("name"));
//		System.out.println(p2.get("pnum"));
	
	}
}
