import java.util.Scanner;

public class quiz13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
      
    
        
        
        for (int b = 1;   b<=a  ;   b++   ) {
        	
        	if( a%b==0 ) {
        		System.out.println(b);
        	}
        }
        
        

	}

}
