import java.util.Scanner;

public class B4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int j;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			int total = 0;
			int m = sc.nextInt();
			int arr[] = new int[m];
			for (j = 0; j < m; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
				//System.out.println("(((("+sum+"))))");
			
			}
			double avg = (double) sum / m;
			
			for(j=0 ; j < m ; j++) {
				if(arr[j]>avg) {
					total++;
				}
			}
			System.out.printf("%.3f", (double)total * 100 / m);
			System.out.print("%\n");
			//sum=0;
			//total=0;
			//ó���� Ǯ������ total sum �� ��� ������ ����  - �� ������ ���� �ۿ��� ����Ǿ��� ������ 
			//�̋� �������� �ݺ��ɶ� ������ ��� �����ǰ� �ִ� ���� , 
			// �� ������ ���� �ȿ��� �����ϴ� �͵� �ذ�� �� �ϳ� 
		}

	}

}
