import java.util.Scanner;

public class quiz7 {

	public static void main(String[] args) {
		int arr [] = new int [5];
		int index;
		Scanner sc = new Scanner(System.in);
		for(index= arr.length-1 ; index>=0;index--) {
			arr[index]=sc.nextInt();
		}
        for(index=0;index<arr.length;index++) {
        	System.out.print(arr[index]);
        }
	}

	
}
