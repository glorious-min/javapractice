import java.util.Scanner;

public class Array2Quiz4 {

	public static void main(String[] args) {
		// �� 20 , 25 , 30 , 10 , 15 , 5 �� ������ �ִ� �迭�� �ִ�.
		// �ε��� ��ȣ 2���� �Է� �޾Ƽ� �� ���� ���� �ٲٰ� ����Ͻÿ�.
		int arr[] = { 20, 25, 30, 10, 15, 5 };
		Scanner sc = new Scanner(System.in);
	   
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();
		// �Է¹��� �� �ٲٰ� ��� �ٲپ�� ���� ?
		for ( int index = 0; index < arr.length; index++) {
			if(index ==index1 ) {
				int temp=index1;
				index1 = index2;
				index2=	temp;
			
				System.out.println(arr[index1]);
			}
		}
		
		//�� ���� �ȹٲ�� �״�� ������ ????
		// ������ Ǯ�̷δ� ���� ! �� ??? 
		// �������� �ݺ����ȿ� �ѹ� �� ���� ���� �ٲپ������� �ٽ� �ٲپ �����Ƿ� ������ ���� �����ϴ� 
		// ����� �ѹ� �ߴµ� ���� �ΰ��� ������ ���� - index1 �����ϋ� index2�� �ٲ� ���� �ѹ� ��µ� ����,
		//index2���ʰ� �Ǿ����� �̹� ������ �ٲ���� �� index1 �� �ѹ� �ѹ� �� �����Ƿ� !!
		// ó�� ���°��� index1->index2 �� �ٲﰪ ,
		//������ ���� ���� index2->index1�� �ٲ� ������ �����°� !! 
	}

}
