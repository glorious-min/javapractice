import java.util.Scanner;

public class InDecrementOp {

	public static void main(String[] args) {
	//��ĳ�ʸ� ����ϱ� ���ؼ��� import�ؾ��� 
		//scanner�� Ű���带 ���� �Է��� ������ �ڹٿ��� ����� �� �ֵ��� �����ִ� ��ü 
		//sc�� ��ü�� ��Ī - scnner ����ϱ� ���� �̸� ������� ���ص� �ȴ� 
	   //new- ������ �ǹ� 
		//scanner () ������, new�� �Բ����� 
		//new scanner() - "�����ڸ� �����ؼ� ��ü�� �����Ѵ� "
		
		Scanner sc = new Scanner(System.in);//��ĳ�� ��ü ����
		System.out.print("���ڸ� �Է��� �ּ��� .");
		
	int cnt = sc.nextInt(); // int���� ���� �Է� �ްڴ�
	//�ֿܼ� 20�� �Է��� ���� (�Է³� ǥ�� ) �� �� 20�� cnt�� ���Ե� 
       //int cnt = 10;
		
       
       System.out.println("cnt : " + cnt);
       
      System.out.println("cnt ++ : " + cnt++);
      System.out.println("cnt++ ó���� :" + cnt);
      System.out.println("++cnt : " + ++cnt);
      
      System.out.println(++cnt + cnt++);
      
	}

}
