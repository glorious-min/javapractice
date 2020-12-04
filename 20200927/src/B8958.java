import java.util.Scanner;

public class B8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			String str = sc.next();
			int score=0;
			int sum =0;
			for(int j=0 ; j<str.length(); j++) {
				if(str.charAt(j)=='O') {
					score++;
					sum+=score;
				}
			}
			System.out.println(sum);
		}
		

	}

}
