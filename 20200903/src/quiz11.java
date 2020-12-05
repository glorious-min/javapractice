import java.util.Scanner;

public class quiz11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		   
		
		
        int a = sc.nextInt();
        
        if (a>=90&&a<=100    )
        {
        	System.out.println("a");
        }
        else if ( a>=80&&a<=89     ) {
        	
        	System.out.println("b");
        }
        else if (a>=70&&a<=79     ) {
        	
        	System.out.println("c");
        }
        else if (a>=60&&a<=69    ) {
        	System.out.println("d");
        }
        else {
        	System.out.println("f");
        }
	}

}
