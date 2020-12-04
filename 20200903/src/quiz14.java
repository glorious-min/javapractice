import java.util.Scanner;

public class quiz14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = 0;
        if (a<=b) {
        	
        	
        	for (int a1 =a    ;a1<=b;a1++       ) {
        		
        		sum+=a1;
        					
        	}
        	System.out.println(sum);
        	
        }
        else {
        	for (int b1 =b   ;b1<=a;b1++  )
        	sum+=b1;
        	
        }
        
        

	}

}
