import java.util.Scanner;

public class quiz17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("원단위 금액 입력 : ");
		int a = sc.nextInt();
		int b = 0;

		double dollar = 0.00082 * a;
		double euro = 0.00078 * a;
		double en = 0.08824 * a;

		if (a < 0) {
			System.out.println(" 잘못입력하셨습니다");
		}

		else if (a>=0) {
			
			System.out.println("환전할 화페입력 : ");
			b = sc.nextInt();
			if (b == 1 || b == 2 || b == 3) {

			switch (b) {

			case 1:
				System.out.println(a + "은 " + dollar + "달러입니다");
				break;
			case 2:
				System.out.println(a + "은 " + en + "엔입니다");
				break;
			case 3:
				System.out.println(a + "은 " + euro + "유로입니다");
				break;}
			}
			else  {
			System.out.println("잘못입력하셨습니다");
			}
		}

	}

}
