import java.util.Scanner;

public class Array2Quiz7 {

	public static void main(String[] args) {
		//���̰� 5�� ������ �迭�� ���� ��, �迭�� ���̸�ŭ �ϳ��� ���ڸ� �Է¹޾� �����ϰ�, �Է¹��� ������ �������� ���� ����Ѵ�.
		
		int arr[] = new int [5];
		Scanner sc = new Scanner(System.in);
		int i;
		for( i = 0 ; i < arr.length ; i++) {
		 arr[i] = sc.nextInt();
		}
		//�迭�� ���̸�ŭ �ϳ��� ���ڸ� �Է¹޾� ���� 
		
		int j=0;
		for(  i = arr.length-1;i>=0 ; i--) {
			
			arr[j]= arr[i];
					System.out.println(arr[i]);
		}
           // �̷��� �ϸ� ������ ��µ� ���� �ٸ��ɷ� ���� . �� ??? 
		//j�� �ʱ�ȭ�� �������� ??
	} 
	

}
