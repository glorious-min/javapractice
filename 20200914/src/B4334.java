import java.util.Scanner;

public class B4334 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int C = sc.nextInt();
		int N;
		
		int i=1;
		int j=0;
		int arr[]=new int [C];
	
		int sum=0;
		int num=0;
		int size;
		int score=0;
		double avg;
		N = sc.nextInt();
		if(1<=N&&N<=1000&&score>=0&&100>=score) {
		for(;i<=C;i++) {
				
					
					for(j=0;j<arr.length;j++) {
						arr[j]=sc.nextInt();
						sum+=arr[j];}
						avg=sum/arr.length;
						if(arr[j]>avg) {
							num++;
						}

				}
			}
			System.out.println((num/arr.length*100)%2f);
			
		}
		

	}

