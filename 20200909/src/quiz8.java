import java.util.Scanner;

public class quiz8 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double ave = 0;
		int index;
		for (index = 0; index < arr.length; index++) {
			System.out.print(index + 1 + "���� �л��� ���� ");
			arr[index] = sc.nextInt();
			sum += arr[index];
		}
        ave = (sum/arr.length);
        System.out.println("������� "+ave);
        for(index=0;index<arr.length;index++) {
        if(arr[index]>=ave) {
        	System.out.println(index+1+"��°�л��� ����"+arr[index]);
        }
        }
        
	}

}
