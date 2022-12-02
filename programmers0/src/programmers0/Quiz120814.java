package programmers0;

public class Quiz120814 {
	public static void main(String[] args) {
		int n = 1;
		int pizza = 7;
		
		int result = 0;
		
		if(n < 7 || n%pizza != 0) {
			result = n /pizza +1;
		}		
		else {
			result = n / pizza;
		}
		
		
		System.out.println(result);
		
	}
}
