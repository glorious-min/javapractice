import java.util.Scanner;

public class quiz17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �ݾ� �Է� : ");
		int a = sc.nextInt();
		int b = 0;

		double dollar = 0.00082 * a;
		double euro = 0.00078 * a;
		double en = 0.08824 * a;

		if (a < 0) {
			System.out.println(" �߸��Է��ϼ̽��ϴ�");
		}

		else if (a>=0) {
			
			System.out.println("ȯ���� ȭ���Է� : ");
			b = sc.nextInt();
			if (b == 1 || b == 2 || b == 3) {

			switch (b) {

			case 1:
				System.out.println(a + "�� " + dollar + "�޷��Դϴ�");
				break;
			case 2:
				System.out.println(a + "�� " + en + "���Դϴ�");
				break;
			case 3:
				System.out.println(a + "�� " + euro + "�����Դϴ�");
				break;}
			}
			else  {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
			}
		}

	}

}
