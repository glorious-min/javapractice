//���� �� 10���� �Է� �ޱ� ���� �迭�� �����ϰ� ������ �迭 ��ҿ� ������ �Է� ���� �� ����ϴ� �ڵ带 �ۼ� �Ͻÿ�.
import java.util.Scanner;

public class quiz10 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr =new int [10];
		Scanner sc = new Scanner(System.in);
		int a=0;
		int index=0;
		
		for (index=0 ; index <10 ;index ++) {
			
			System.out.print((index+1)+"���� ������ ");
			a=sc.nextInt();
			arr[index]= a;
		}
		for (index=0;index<10;index++) {
			
			System.out.println(arr[index]);
		}//���� �޼ҵ带 �ΰ��� ���� �ۿ��� �����߱� ������
		//�ι�° ������ ù���� �������� �ʱ�ȭ�� �迭�� ������ ������ �ȴ� 
		//�������� ������ ���� �޼ҵ带 ��ΰ� �����ϱ� ������ .
	}

}
