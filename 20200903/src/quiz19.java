import java.util.Scanner;

public class Backjoon1 {

	public static void main(String[] args) {
        
		int a,b,c,temp;
		Scanner sc = new Scanner ( System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if ( a>b) {
			a=b;
			b=a;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

		
			
			
		
		if ( c<a  ) {
			a=c;
			c=a;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		if ( b>c) {
			b=c;
			c=b;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}} // �̷��� �ϸ� �� �ȵ��� ??? ó�� ���� ���� ��� �������⶧���� �ȵ� 
