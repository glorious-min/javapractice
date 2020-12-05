import java.util.Scanner;

public class B15596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int a [] = new int [n];
		for(int i =0 ; i < a.length ; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Test.sum(a));
	}
}

class Test {
	public static long sum(int a []) { // 파라미터값을 받은것
		//여기에서 a를 생성한것이나 마찬가지 이므로 이를 아래에서 바로 쓸 수 있다 
		long sum =0; // 여기에서 sum은 변수 
		for(int i = 0 ; i  <a.length ; i++) {
			
			sum+=a[i];
		}
		return sum; //
	} // 메인 클래스에서 sum 메소드를 호출하면 , 
	//입력한 값들이 파라미터값이 되고 이 값들이 sum메소드에서 계산이 된 후 마지막에 리턴이 되어서 그 값을 호출한곳으로 간다 
	//어떤값이 파라미터값에 들어가든 한 번 만든 메소드를 계속 쓸 수 있다 
}