import java.util.Scanner;

public class Array2Quiz4_1 {

	public static void main(String[] args) {
		// �� 20 , 25 , 30 , 10 , 15 , 5 �� ������ �ִ� �迭�� �ִ�.
	    // �ε��� ��ȣ 2���� �Է� �޾Ƽ� �� ���� ���� �ٲٰ� ����Ͻÿ�.
		
		int arr [] = {20,25,30,10,15,5};
		Scanner sc = new Scanner(System.in);
	    int index1 = sc.nextInt();
	    int index2 = sc.nextInt();
	    
	    int temp = index1;
	    index1 = index2;
	    index2 = temp;
	    
	    System.out.println(arr[index1]);
	    System.out.println(arr[index2]);
        // �̹� �迭�� �ʱ�ȭ�� �Ǿ��� ������ ���� �����ʿ� ���� �ε����� �ٲپ� �ָ� �ȴ� !!
	}

}
