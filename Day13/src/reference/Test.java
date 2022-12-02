package reference;

class UnitTest {
	String name;	// 이름
	int atk;		// 공격력
	int def;		// 방어력
	int hp;			// 체력
	
	
	public void attack(UnitTest other) {
		// 공격이란, 대상의 체력에서, 나의 공격력만큼 뺀 수치를 대상의 체력으로 넣는 작업이다
		other.hp -= this.atk;	// this. 를 잘생각하자 공격자...!
	
	}

	
}



public class Test {
	public static void main(String[] args) {
		UnitTest ob1 = new UnitTest();
		ob1.name = "마린";
		ob1.atk = 5;
		ob1.hp = 40;
		
		UnitTest ob2 = new UnitTest();
		ob2.name = "저글링";
		ob2.atk = 6;
		ob2.hp = 35;
		
		while(ob1.hp > 0 && ob2.hp > 0) {
//			ob2.hp = ob2.hp - (ob1.atk - ob2.def);
			ob1.attack(ob2);
//			System.out.printf(ob1.name+"가 "+ob2.name+"을 공격하였습니다\n");
			
//			ob1.hp = ob1.hp - (ob2.atk - ob1.def);
			ob2.attack(ob1);
//			System.out.printf(ob2.name+"가 "+ob1.name+"을 공격하였습니다\n");
			
			
			System.out.printf("ob1 : [%s, %d]\n", ob1.name, ob1.hp);
			System.out.printf("ob2 : [%s, %d]\n", ob2.name, ob2.hp);
			System.out.println();
		}
		
	}
	

}
