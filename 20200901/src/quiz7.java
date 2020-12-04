import java.util.Scanner;

public class quiz7 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   int a =0;
	   int b=0 ;
	    int sum = 0;
		while(a!=-1) {
			b+=1;
			System.out.print( b +"번쨰 정수 입력 (-1종료) :"  );
			 a = sc.nextInt();
			
			 sum += a;
			 
			
		}
      
		System.out.print("현재까지 입력된 정수의 합 :" + sum+1);
	}

}
