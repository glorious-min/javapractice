//����ڷκ��� �迭�� ũ�⸦ �Է¹޴´�. �Է¹��� ũ���� int�� �迭�� �����Ѵ�. 
//�迭�� ���� ��ҿ� ����ڷκ��� ���� �Է¹޴´�. �Է� ���� ������ �� �հ踦 ����Ѵ�.
import java.util.Scanner;

public class quiz12 {

	public static void main(String[] args) {
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int arr[] = new int[a];
		
		int sum = 0;
		
		for (int a1 = 0; a1 < arr.length; a1++) {
			System.out.println(a1 + 1 + "��° ���� �Է��ϼ���");

			int b = sc.nextInt();
			arr[a1]=b;
			System.out.println(arr[a1]);
			sum += b;
		}
		System.out.println("�迭 ����� ���� "+sum);
	}

}
