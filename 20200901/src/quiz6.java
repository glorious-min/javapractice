import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a =0;
		while (a < 100) {
		
			System.out.print("100 이상의 정수를 입력하세요 : ");
		    a = sc.nextInt();
		}
		System.out.println(a + "-> 100 입력완료 !");
		

	}

}
