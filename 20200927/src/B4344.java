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
			//처음에 풀었을떄 total sum 이 계속 증가한 이유  - 두 변수가 포문 밖에서 선언되었기 떄문임 
			//이떄 포문에서 반복될때 갑사이 계속 유지되고 있는 상태 , 
			// 두 변수를 포문 안에서 선언하는 것도 해결법 중 하나 
		}

	}

}
