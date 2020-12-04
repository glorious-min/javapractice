import java.util.Random;
import java.util.Scanner;

public class ArrayRandomQuiz5 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int a = ran.nextInt(50)+1;
		int b;
		while (true) {   // 그런데 왜 int b 를 와일문 위에 선언하고 입력하는 것만 와일문 안에 넣으면 실행이 안될까 ??
			b= sc.nextInt();
			if(a>b) {
				System.out.println("up");
			}
			else if(a<b) {
				System.out.println("down");
			}
			else {
				System.out.println("good");
				break;
			}
		}
		
		

	}

}
