import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		   
        int a = sc.nextInt();
       
        
        System.out.println( a/3600+"시간"+(a%3600)/60+"분"+(a%3600)%60+"초" );
        

	}

}
