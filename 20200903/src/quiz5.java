import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		   
        int a = sc.nextInt();
       
        
        System.out.println( a/3600+"�ð�"+(a%3600)/60+"��"+(a%3600)%60+"��" );
        

	}

}
