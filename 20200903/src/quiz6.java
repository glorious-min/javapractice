import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		   
        int a = sc.nextInt();
       
System.out.println(a+"원은"+a/50000+"만원권"+a%50000/20000+"장 5000원권"+a%50000%20000/5000+"장 천원권 "+a%50000%20000%5000/1000+"장을 지불하고"+a%50000%20000%5000%1000+"가 남습니다");

}

}
