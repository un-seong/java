package dddddddddd;
import java.util.Scanner;


public class save {
		public static void main(String[] args) {

			int a, b;
			
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			sc.close();
			
			int first = a *(b%10);		// 첫번째 자리 구하는 공식
			System.out.println(first);
			
			
			int second = a*((b/10)%10);  // 두번째 자리 구하는 공식 -> %가 나머지 인거를 잘 생각하자
			System.out.println(second);
			
			int third = a * (b/100);	// 마지막 세번째 자리 구하는 공식!
			System.out.println(third);
			
			System.out.println(a*b);
	        
	    }
	    
	}
