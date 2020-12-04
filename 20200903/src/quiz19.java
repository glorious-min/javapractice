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

}} // 이렇게 하면 왜 안되지 ??? 처음 부터 값이 계속 같아지기때문에 안됨 
