import java.util.Scanner;

public class B15596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a [] = new int [n];
		for(int i = 0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Test.sum(a));
	}
}
class Test {
	public static long sum(int a []) {
		long sum =0;
		for(int i = 0 ; i < a.length ; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
