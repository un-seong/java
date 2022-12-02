package air;

public class Main {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		Human h1 = new Singer("이모씨");
		Human h2 = new Singer("최모씨");
		Human h3 = new Singer("강모씨");
		Human h4 = new Doctor("김닥터");
		Human h5 = new Doctor("정닥터");
		Human h6 = new Doctor("이박사");
		
		air.entrance(h1);
		air.entrance(h2);
		air.entrance(h3);
		air.entrance(h4);
		air.entrance(h5);
		air.entrance(h6);
		
		
	
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다 (1명은 못탐)
		// Human의 서브클래스는 여러개를 만들어도 됩니다
		// 이때, 최소 2명의 의사를 포함시킵니다
		
		int emr = air.emergency();
		
		// 비행기 내부에서 의사가 있다면, 의사의 heal() 함수를 호출하여 대상을 치료하는 코드를 작성하세요
		
		for(int i = 0 ; i < air.arr.length; i++) {
			if(air.arr[i] instanceof Doctor && air.arr[i] != air.arr[emr]) {
				Doctor d = (Doctor)air.arr[i];
				d.heal(air.arr[emr]);
				d.show();
				break;
			}
		}
		
	}
}
