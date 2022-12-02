package animalHospital;

public class Dog extends Animal {
	
	Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void bark() {
		System.out.println(name + " : 멍멍");
		
	}
	
	public void tailling() {
		System.out.println(name + "가 꼬리를 흔듭니다");
	}

//	public static void main(String[] args) {
//		Dog d1 = new Dog("바둑이", 33);
//		
//		d1.bark();
//		d1.tailling();
//	}
	
}
