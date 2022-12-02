package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Food implements Comparator<Integer>, Comparable<Food>{
	String brand;
	String menu;
	int price;
	
	Food(String brand, String menu, int price) {
		this.brand = brand;
		this.menu = menu;
		this.price = price;
	}
	
	@Override
	public int compareTo(Food o) {
		return o.price - this.price;
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}

	

	
	@Override
	public String toString() {
		return String.format("%s , %s : %,d원", brand, menu, price);
	}
	
}

public class Ex11 {
	public static void main(String[] args) {
		// 메인 함수 코드가 잘 작동하도록 클래스 및 함수를 작성하여 구현하세요
		
		Food f1 = new Food("굽네치킨", "고추바사삭", 21000);
		Food f2 = new Food("BBQ치킨", "황금올리브", 20000);
		Food f3 = new Food("굽네치킨", "깐풍치킨", 22000);
		Food f4 = new Food("교촌치킨", "허니콤보", 21000);
		Food f5 = new Food("KFC", "핫크리스피", 22500);
		
		List<Food> list = new ArrayList<Food>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(f5);
		
		list.forEach(food -> System.out.println("정렬 전 : " +food));
		System.out.println();
		list.sort(null);	// 기본 정렬하면 가격 내림차순으로 정렬하기
		list.forEach(food -> System.out.println("가격정렬 후 : " + food));
		System.out.println();
		// 여기에는 직접 기준을 지정하여, 브랜드 기준 오름차순으로 정렬하기	
		
//		list.sort((a,b)->{
//			return a.brand.compareTo(b.brand);
//		});
		list.sort((a,b)->a.brand.compareTo(b.brand)); // 중략 가능하다! 하나면
		
		list.forEach(food -> System.out.println("브랜드 오름차순 : " +food));
		
	}
}
