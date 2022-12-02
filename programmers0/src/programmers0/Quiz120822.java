package programmers0;

public class Quiz120822 {
	public static void main(String[] args) {
		String my_string = "jaron";
		String answer = "";
		
		StringBuffer sb = new StringBuffer();
//		sb.insert(0, my_string);
		
		sb.append(my_string);
		
		answer = sb.reverse().toString();
		
		System.out.println(answer);
		
	}
}
