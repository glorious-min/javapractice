import java.util.Scanner;

public class Array2Quiz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr [] = {20,25,30,10,15,5};
		
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();
		
		int temp = index1;
		index1 = index2;
		index2 = temp;
		
		System.out.println(arr[index1]);
		System.out.println(arr[index2]);
		

	}

}
