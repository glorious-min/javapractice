import java.util.Scanner;

public class ConditionalRepetitiveWrapQuiz2 {

	public static void main(String[] args) {
		// �ΰ��� ������ �Է¹ް� �����ϰ��� �ϴ� ������ �Է� �޾Ƽ� ������ �ϼ��ϴ� �ڵ带 �ۼ��Ͻÿ�.
		//����ġ�� �ۼ��� �ؾ������ ���� !!
		Scanner sc = new Scanner(System.in);
	    System.out.println("ù���� �� �Է� ");
		int i = sc.nextInt();
		System.out.println("�ι�°�� �Է�");
		int j = sc.nextInt();
		System.out.println("=========");
		System.out.println("�޴����� : ");
		int num=sc.nextInt();
		switch(num) {
		case 1 : 
		     System.out.println(i+j);
		     break;
		case 2 : 
		     System.out.println(i-j);
		case 3 :
			System.out.println(i*j);
		case 4 :
			System.out.println((double)i/j);
			
		
		}

	}

}
