
public class quiz4 {

	public static void main(String[] args) {

		int a;
		int b = 1;

		for (int a1 = 1; a1 < 10; a1++) {

			if (a1 % 2 == 0) {

				for (int b1 = 1; b1 <= 5; b1++) {
					System.out.println(a1 + "*" + b1 + "=" + a1 * b1);
				}

			}else if (a1 % 2 == 1) {
				{
					for (int b1 = 6; b1 < 10; b1++)
						System.out.println(a1 + "*" + b1 + "=" + a1 * b1);

				}
			}
		}

	}
	
}
