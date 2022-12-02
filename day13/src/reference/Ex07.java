package reference;

class Unit7 {
	String name;
	int atk;
	int hp;
	
	Unit7(String name, int atk, int hp) {
		this.name = name;
		this.atk = atk;
		this.hp = hp;
	}
	
	void attack(/*Unit6 this */ Unit7 target) { // Unit6 this < 생략 가능
		target.hp -= this.atk;
	}
	
	
	
}
public class Ex07 {
	// attack 함수는 Unit 자료형의 객체만 처리하므로, Unit 자료형에 함수를 포함시켜버린다
		
	
	
	public static void main(String[] args) {
			
		Unit7 ob1 = new Unit7("마린", 5, 40);
		Unit7 ob2 = new Unit7("저글링", 6, 35);
		
				
		while(ob1.hp > 0 && ob2.hp > 0) {
			ob1.attack(ob2);	// attack함수를 호출한 주체가 this로 전달된다
			ob2.attack(ob1);	// 위치만 바꾸어서 같은 함수를 호출
					
			System.out.printf("ob1 : [%s, %d]\n", ob1.name, ob1.hp);
			System.out.printf("ob2 : [%s, %d]\n", ob2.name, ob2.hp);
			System.out.println();
		}
			
	}
}

