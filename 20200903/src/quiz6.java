import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		   
        int a = sc.nextInt();
       
System.out.println(a+"����"+a/50000+"������"+a%50000/20000+"�� 5000����"+a%50000%20000/5000+"�� õ���� "+a%50000%20000%5000/1000+"���� �����ϰ�"+a%50000%20000%5000%1000+"�� �����ϴ�");

}

}
