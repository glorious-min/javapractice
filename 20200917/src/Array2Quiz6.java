import java.util.Scanner;

public class Array2Quiz6 {

	public static void main(String[] args) {
		//���� 5���� �Է¹��� �� �ִ� �迭�� ���� �ؼ� ������ ��ҿ� ���� �Է¹ް�, ����, ����� ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		int arr [] = new int [5];
		Scanner sc = new Scanner (System.in);
		int index;
		int sum=0;
		int ave=0;
		for(index = 0 ; index < arr.length ; index ++) {
			arr[index] = sc.nextInt();
			sum += arr[index];
			
		}
        
		ave = sum/arr.length;
		System.out.println(sum);
		System.out.println(ave);
	}

}
