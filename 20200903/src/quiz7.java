import java.util.Scanner;

public class quiz7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		   
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        double c=((a-b)/a+(a-b)%a);
        System.out.println(c/100+"%");
        
        
        
        
	}

}
