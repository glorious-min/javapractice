import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double ave;
		double sum = 0;
		 int i;
		double arr[] = new double[N];

		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		//
		for (i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] < arr[j]) {
					int temp = (int) arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (i = 0; i < arr.length; i++) {
			double a = arr[i] / arr[arr.length - 1] * 100;
			arr[i] = (double) a;
			sum += (double)arr[i];//���������� ���⿡ double ���̴� ���� ���� �ڸ����� ��µ� 
		}
		
		ave = sum / arr.length;
		System.out.println((double)ave);
	}

}
