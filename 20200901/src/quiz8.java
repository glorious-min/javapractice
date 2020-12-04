import java.util.Scanner;

public class quiz8 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int sum= 0 ;
		
		
		
		
		
		if ( b>a || a <0) {
			System.out.println("잘못입력하셨습니다");
		}
		
		else {
		
		while( a>c ) { 
			// 왜 c를 0으로 정의하면 답이 1을 제외한 수로 더해져서 나올까 ?
			c++;
		
			if (c%b!=0 ) {
				sum  += c;
				//System.out.println(c);
				
			 }
		}
		System.out.println(sum);
		
		
		

	}}

}
