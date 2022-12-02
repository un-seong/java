package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일"); // parse 를 한글로 받으려면 안됨
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd");		
		String input;
		Date start;
		long st, et, dayCount;
		
		System.out.println("날짜 입력 (yyyy-MM-dd) : ");
		input = sc.nextLine();
		System.out.println("며칠 : ");
		dayCount = Long.parseLong(sc.nextLine());
		
		start = sdf.parse(input);	// parse = String을 date로
		st = start.getTime();
		et = st + (60 * 60 * 24 * dayCount * 1000);
		// 		  60초 * 60분 * 24시간 * dayCount일 * 1000(millisecond)
		// 맨끝에 1000은 Java가 1/1000초로 계산하기 때문에 곱해야함
		
		
		for(long i = st; i < et; i+= (60 * 60 * 24 * 1000)) {
			Date d = new Date(i);
			String s = sdf2.format(d); 
			System.out.println(s);
		}
		System.out.println("끝");
		sc.close();
		
		Date test = sdf.parse("1970-01-01"); // GMT + 0900
		System.out.println(test.getTime()+ (60 * 60 * 9 * 1000));
	}
}
