import java.util.Scanner;

public class quiz8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		   
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
       double d= 0.40*a+0.30*b+0.30*c;
        if (d>=70 ) {
        	
        	System.out.println(" 수료 true");
        }
        else {
        	
        	
        	System.out.println("수료 false");
        }
	}

}
