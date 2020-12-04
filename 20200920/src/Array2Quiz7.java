import java.util.Scanner;

public class Array2Quiz7 {

	public static void main(String[] args) {
		// 길이가 5인 정수형 배열을 생성 후, 
		//배열의 길이만큼 하나의 숫자를 입력받아 저장하고, 입력받은 순서의 역순으로 값을 출력한다.
		// 역순으로 '출력'만 하면 됨 !!
		int arr [] = new int [5];
		Scanner sc = new Scanner(System.in);
		int i;
		for(i = 0 ; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(i=arr.length-1 ; i>=0; i --) {
			System.out.print(arr[i]);
		}
		}

}
