import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		int arr [] = new int [5];
		int sum=0;
		int ave=0;
		Scanner sc = new Scanner(System.in);
		for(int index =0 ; index<arr.length;index++) {
			arr[index]=sc.nextInt();
			sum+=arr[index];
			ave=sum/arr.length;
		}
		System.out.println(sum);
		System.out.println((double)ave);
	}

}
