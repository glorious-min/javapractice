import java.util.Scanner;

public class B15596_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		for(int i = 0 ; i <arr.length ; i ++) {
			arr [i] = sc.nextInt();
		}
		System.out.println(Test1.sum(arr)); // �� Ŭ������ �׽�Ʈ�� sum(arr) �̶�� �ص� b15596�� �޼ҵ尡 ����Ǵ°��� ?
	}
}
class Test1{
	public static long sum(int arr[]) {
		int sum = 0 ;
		for(int i = 0 ; i < arr.length ; i ++) {
			sum +=arr[i]; // �׷��� b15596 Ŭ�������� �迭�� ���� �Է��ҋ����� ���� �Ķ���͸� ���� ����� ���� �����°� ?
		}
		return sum ;
	}
}
