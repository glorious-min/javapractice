import java.util.Scanner;

public class HassadNumber {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("�ϻ����� ���� �Է��� �ּ���");
	 int X = sc.nextInt();
	 int sum=0;
	 int a =X; // ����ڰ� �Է��ϴ� ���� �ϴ� ��ȣ���־���Ѵ�. ���� �������� ���� ���ϴ� �������� ���� ��ȭ�ϱ� ������ !!!
	
	 while (a>0) {
		sum+=a%10;
		a/=10;
		//System.out.println(sum);
		//System.out.println(a);
		
	 }
	
	 if(X%sum==0) { // a�� ���ϴ� �� �������� ����ڰ� �Է��� ���� �Ǻ��� �ؾ��ϹǷ�  X�� �ٲپ�� �Ѵ� ! 
		 System.out.println("��");
	 }
	 else {
		 System.out.println("����");
	 }
    
	}

}
