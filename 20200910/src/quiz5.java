import java.util.Random;
import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int num=ran.nextInt(50)+1;
		int num1;
		for(num=1;num<=50;num++) {
			 System.out.println("수를 입력하여 맞춰보세요 ");
			 num1=sc.nextInt();
			 if(num1<num) {
				 System.out.println("up");
			 }
			 else if(num1>num) {
				 System.out.println("down");
			 }
			 else {
				 System.out.println("good");
				 break;
			 }
		}
		
	}

}
