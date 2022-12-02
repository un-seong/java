package programmers;

public class Quiz12943 {

    public static void main(String[] args) {
		int n = 6;
		int answer = 0;
        
        while(n != 1) {
            answer ++;
            if (n%2 == 0) {
             n = n/2;
            }else {
             n = (n*3)+1;
            }
            if (answer==500) {
             answer = -1;
            }
        }
        System.out.println(answer);
	}
}