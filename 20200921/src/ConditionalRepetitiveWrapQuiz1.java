import java.util.Scanner;

public class ConditionalRepetitiveWrapQuiz1 {

	public static void main(String[] args) {
		// �� ������ ������ �Է¹޾� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	    Scanner sc = new Scanner(System.in);
	    System.out.println("�����Է�");
	    int i = sc.nextInt();
	    
	    if(i>=90&&i<=100) {
	    	System.out.println("�����Դϴ�");
	    }
	    else if(i>=80&&i<=89) {
	    	System.out.println("���Դϴ�");
	    }
	    else if(i>=70&&i<=79) {
	    	System.out.println("���Դϴ�");
	    }
	    else if (i>=60&&i<=69) {
	    	System.out.println("���Դϴ�");
	    }
	    else {
	    	System.out.println("�����Դϴ�");
	    }

	}

}
