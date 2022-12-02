package test;




public class KoreaBook extends Book {
	public void showPrice() {
		System.out.println("국어 가격 : " + price);
	}
	
	
	
	public void showPrice(int count) {
		System.out.println("국어책 " + count + "권 가격 : " + price * count);
	}
}




