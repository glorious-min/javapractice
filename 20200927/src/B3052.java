 import java.util.Scanner;

public class B3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int [10];
		int count [] = new int [42];
		
		
		for(int i = 0 ; i < 10 ; i++) {
			arr[i]=sc.nextInt();
			count[arr[i]%42]++; // arr[i]%42�� �ε����� ������ �ִ� count �迭���� ���� �ݺ����� �������� ���� ��Ŵ 
			//count �迭�� ��Ʈ�� �迭�̱� ������ �ʱⰪ�� ��� 0�� ������ �ִ� ���� 
			//����  �迭�� ��� �� �� arr[i]%42�� �ε����� ������ �ִ� �迭�鸸 0 �� �ƴ� ���� �����Եȴ� 
		}
		int total=0;
	    for(int j = 0 ; j < count.length ; j++) {
	    	if (count[j]!=0) {
	    		total++;
	    	}
	    }
		System.out.println(total);
	}

}
