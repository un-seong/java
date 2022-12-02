package programmers;

public class Quiz12916 {
	public static void main(String[] args) {
		String n = "pPoooyY";
		String str = "Pyy";
		boolean answer = false;

		System.out.println(n.substring(0, 1));
		System.out.println(n.substring(1, 2));
		System.out.println(n.substring(2, 3));
		System.out.println(n.substring(3, 4));
		System.out.println(n.substring(4, 5));
		System.out.println(n.substring(5, 6));
		System.out.println(n.substring(6, 7));
		
		System.out.println(n);
		
		int nocount = 0;
		int pcount = 0;
		int ycount = 0;
		
		for(int i = 0; i<n.length(); i++) {
			if(n.substring(i, i+1).contains("p") || n.substring(i, i+1).contains("P")) {
				pcount++;
			}else if(n.substring(i, i+1).contains("y") || n.substring(i, i+1).contains("Y")) {
				ycount++;
			}else {
				nocount++;
			}
		}
		System.out.println(pcount);
		System.out.println(ycount);
		
		if(pcount == ycount) {
			answer = true;
		}else {
			answer = false;
		}
		
		System.out.println(answer);
	}
}
