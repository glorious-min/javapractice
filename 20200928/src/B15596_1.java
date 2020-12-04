import java.util.Scanner;

public class B15596_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		for(int i = 0 ; i <arr.length ; i ++) {
			arr [i] = sc.nextInt();
		}
		System.out.println(Test1.sum(arr)); // 왜 클래스명 테스트에 sum(arr) 이라고 해도 b15596의 메소드가 실행되는거지 ?
	}
}
class Test1{
	public static long sum(int arr[]) {
		int sum = 0 ;
		for(int i = 0 ; i < arr.length ; i ++) {
			sum +=arr[i]; // 그러면 b15596 클래스에서 배열의 값을 입력할떄마다 위의 파라미터를 통해 여기로 값이 들어오는것 ?
		}
		return sum ;
	}
}
