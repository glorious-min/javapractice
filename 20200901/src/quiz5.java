import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b = 1;

		if (a > 9 || a < 1) {
			System.out.println("1���� 9������ ������ �Է� �����մϴ� ");
		} else {
			while (b < 10) {
				System.out.println(a + "*" + b + "=" + a * b);
				++b;
			}
		}

	}

	
}
