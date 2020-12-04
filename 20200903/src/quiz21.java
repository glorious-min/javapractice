import java.util.Scanner;

public class quiz21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int sum = 0;
		int a1;
		do {
			
			a1 = sc.nextInt();
			
			if ( a1%3==0    ) {
				sum++;
				
			}
			
			
		}while( a1!=0 );
         System.out.println(sum);
	}
       
}
