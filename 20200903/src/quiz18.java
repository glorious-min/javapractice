import java.util.Scanner;

public class quiz18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int a1 = a;
		int b1 = b;

		b = a1;
		a = b1;

		System.out.println(a);
		System.out.println(b);
	}

}
