import java.util.Scanner;

public class quiz7 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   int a =0;
	   int b=0 ;
	    int sum = 0;
		while(a!=-1) {
			b+=1;
			System.out.print( b +"���� ���� �Է� (-1����) :"  );
			 a = sc.nextInt();
			
			 sum += a;
			 
			
		}
      
		System.out.print("������� �Էµ� ������ �� :" + sum+1);
	}

}
