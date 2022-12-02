package airplane;

public class Main {

	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		Human s1 = new Singer("정홍일");
		Human s2 = new Singer("아이유");
		Human s3 = new Singer("싸이");
		Human d1 = new Doctor("김사부");
		Human d2 = new Doctor("이국종");
		Human d3 = new Doctor("이익준");
		
		air.entrance(s1);
		air.entrance(s2);
		air.entrance(s3);
		air.entrance(d1);
		air.entrance(d2);
		air.entrance(d3);
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다 (1명은 못탐)
		// Human의 서브클래스는 여러개를 만들어도 됩니다
		// 이때, 최소 2명의 의사를 포함시킵니다
						
		
		int emr = air.emergency();	// 아픈 사람의 인덱스로 뽑은 번호 이용하기

		// 비행기 내부에서 의사가 있다면, 의사의 heal() 함수를 호출하여 대상을 치료하는 코드를 작성하세요
//		for(int i = 0; i < air.arr.length; i++) {
//			if(air.arr[i] instanceof Doctor && air.arr[emr] != air.arr[i]) {
//				Doctor d = (Doctor)air.arr[i];
//				d.heal(air.arr[emr]);
//				break;
//			}
//		}
				
		air.healer(emr);
		
		
	}
	
	

}
