package book;

public class Yes24 {
	String name;		// 책이름
	String author;		// 저자
	String publisher;	// 출판사	
	int price;			// 가격
	double starPoint;	// 별점
	
	Yes24(String name, String author, String publisher,
			int price, double starPoint) {
		
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.starPoint = starPoint;
	
	}
	
	String toStr() {
		String form = "%s (%s | %s)\t%,d원 (내용: %.1f)";
		form = String.format(form, name, author, publisher, price, starPoint);
		return form;
	}
	
}
