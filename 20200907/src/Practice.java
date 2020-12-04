import java.util.Scanner;
//배열의 크기를 직접입력하라 
public class Practice {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 ");
		int length = sc.nextInt();
		int[] intArr = new int[ length];
		
		
		
	   for (int i=0; i < intArr.length;i++) {
		   System.out.println(intArr[i]);
	   }

	}

}
