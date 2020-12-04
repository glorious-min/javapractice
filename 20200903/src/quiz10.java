import java.util.Scanner;

public class quiz10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		   
        int a = sc.nextInt();
        
        if ( a<=999&&a>=0      ) {
        	
        	System.out.println(a/100+a%100/10+a%100%10);
        }

        
	}
	

}
