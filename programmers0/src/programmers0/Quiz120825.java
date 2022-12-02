package programmers0;

public class Quiz120825 {
	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		String answer = "";
		
		for(int i = 0; i<=my_string.length()-1; i++) {
			for(int j =0; j<=n-1; j++) {
				answer += my_string.charAt(i);
			}
		}
		
		System.out.println(answer);
					
	}
}
