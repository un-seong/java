package programmers0;

public class Quiz120956 {
	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		int answer = 0;
		
		String[] babbling1 = { "aya", "ye", "woo", "ma"};
				
		for(int i = 0 ; i < babbling.length; i++) {
			for(int j = 0; j<babbling.length-1; j++) {
				if(babbling[i].equals(babbling1[j]) && babbling[i].contains(babbling1[j])) {
					answer++;
				}
			}
		}
		System.out.println(answer);
		
		
	}
}
