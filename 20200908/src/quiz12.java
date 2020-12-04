//사용자로부터 배열의 크기를 입력받는다. 입력받은 크기의 int형 배열을 생성한다. 
//배열의 각각 요소에 사용자로부터 값을 입력받는다. 입력 받은 값들의 총 합계를 출력한다.
import java.util.Scanner;

public class quiz12 {

	public static void main(String[] args) {
		System.out.println("배열의 크기를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int arr[] = new int[a];
		
		int sum = 0;
		
		for (int a1 = 0; a1 < arr.length; a1++) {
			System.out.println(a1 + 1 + "번째 값을 입력하세요");

			int b = sc.nextInt();
			arr[a1]=b;
			System.out.println(arr[a1]);
			sum += b;
		}
		System.out.println("배열 요소의 총합 "+sum);
	}

}
