import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		

		
	

			for (int n1 = 1; n1 <= N; n1++) {

				for (int n2 = 1; n2 <= N; n2++) {
					if (n1 + n2 <= N) {

						System.out.print(" ");
					} else {

						System.out.print("*");
					}
				}
				System.out.println();
			}

		}

	
	}
