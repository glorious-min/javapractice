import java.util.Scanner;

public class quiz8 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int sum= 0 ;
		
		
		
		
		
		if ( b>a || a <0) {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
		}
		
		else {
		
		while( a>c ) { 
			// �� c�� 0���� �����ϸ� ���� 1�� ������ ���� �������� ���ñ� ?
			c++;
		
			if (c%b!=0 ) {
				sum  += c;
				//System.out.println(c);
				
			 }
		}
		System.out.println(sum);
		
		
		

	}}

}
