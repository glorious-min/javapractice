import java.util.Scanner;

public class quiz4 {

	public static void main(String[] args) {
		int arr []= {20,25,30,10,15,5};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ε��� 1�� �Է��Ͻÿ�");
		int index1 = sc.nextInt();
		System.out.println("�ε��� 2�� �Է��Ͻÿ�");
    	int index2 = sc.nextInt();
		int temp=0;
		temp=index1;
		index1=index2;
		index2 = temp;
		System.out.println(arr[index1]);
		System.out.println(arr[index2]);
		
		
		
		

	}

}
