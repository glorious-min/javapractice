import java.util.Random;
import java.util.Scanner;

public class ArrayRandomQuiz5 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int a = ran.nextInt(50)+1;
		int b;
		while (true) {   // �׷��� �� int b �� ���Ϲ� ���� �����ϰ� �Է��ϴ� �͸� ���Ϲ� �ȿ� ������ ������ �ȵɱ� ??
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
