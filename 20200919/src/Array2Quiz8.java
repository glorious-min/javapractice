import java.util.Scanner;

public class Array2Quiz8 {

	public static void main(String[] args) {
		int arr [] = new int [5];
		int sum=0;
		int avg=0;
		int i;
		Scanner sc = new Scanner(System.in);
		for(i =0 ; i <arr.length ; i++ ) {
			arr[i] = sc.nextInt();
					sum+=arr[i];
		}
		
         avg= sum / arr.length;
         for(i =0 ; i <arr.length ; i++ ) {
 			if(arr[i]>=avg) {
 				System.out.println(i+1+" "+arr[i]);
 			}
 		}
	}

}
