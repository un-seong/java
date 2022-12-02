package collection;

import java.util.HashMap;

class Person {	// private 멤버 필드, public getter/setter가 있고, 기본생성자가 생략되어 있다
				// Java Beans : 데이터를 저장하는 용도로 사용할 수 있는 자바 클래스 형식
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		String form = "{name=%s, age=%d}";
		return String.format(form, name, age);
	}
		
}

public class Ex06 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("이지은");
		p1.setAge(30);
		
		HashMap<String, Object> p2 = new HashMap<String, Object>();
		p2.put("name", "홍진호");
		p2.put("age", 41);
				
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
		System.out.println();
		
		System.out.println("p1의 이름은 " + p1.getName());	// ${p1.name }
		System.out.println("p1의 나이는 " + p1.getAge());	// ${p1.age }
		System.out.println();
		
		System.out.println("p2의 이름은 " + p2.get("name"));	// ${p2.name }
		System.out.println("p2의 나이는 " + p2.get("age"));		// ${p2.age }
		System.out.println();
		
		
				
	}
}
