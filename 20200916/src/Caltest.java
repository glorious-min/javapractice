import java.util.Scanner;

public class Caltest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ŭ������ �̿��� �ν��Ͻ� ���� 
		Cal calculator = new Cal(); // ���輭�� �������� ��� �ִ� ��ü�� ��������� 
		//������ �ν��Ͻ��� �޼��带 ȣ�� 
		
		System.out.println("num1 �Է�");
		int num1 = sc.nextInt();
		System.out.println("num2 �Է�");
		int num2 = sc.nextInt();
		int sum = calculator.plus(num1,num2);// ��ȯ�Ǵ� ���� sum ���� ���� �ȴ� 
		// int sum = ��ȯ�Ǵ� �� �μ� !!! 
	    System.out.println("plus�޼ҵ������"+sum);
		
	    int result = calculator.minus(num1, num2); // ���ϵǾ ���ϵ� ���� ������ ��� ���� 
	    System.out.println("minus ������ "+result);
	    //System.out.println(" ������ "+calculator.minus(num1, num2)); ��� ������ ���� ������ �� �������� ���� 
	    //�������� ������ 
	    
	    double conclude = calculator.devide(num1,num2); // result�� �ٸ� �̸����� �ٲپ�� ����� 
	    //���������� = ������ �ߺ� 
	    System.out.println("devide ������"+result);
	    
	    System.out.println("� ����� �ұ�� ? ");
	    String op = sc.nextLine();
	    sc.nextLine(); // �̰� �־�� ���� ������ 
	    
	    if(op.equals("+")) {
	    	System.out.println(num1 + "+" + num2 + "=");
	    	System.out.println(cal.plus(num1,num2));
	    }  else if(op.equals("-")) {
	    	System.out.println(num1+op+num2 + "=");
	    	System.out.println(cal.minus(num1,num2));
	    }
	    
	    else {
	    	System.out.println("�����ڸ� �߸��Է��߽��ϴ�");
	    }
	}
	
	   

}
