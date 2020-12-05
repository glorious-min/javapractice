
public class OverLoadingTest {
	
	public double method(double a) {
		return a + 12.5;
	}
	public int method(int a) {
		return a +10;
	}
	
	//public double method(int a ) {
		//return a + 12.5;
	//}
	
	public int method(int a,  int b) {
		return a+b;
	}
	public static void main(String[] args) {
		OverLoadingTest over = new OverLoadingTest();
		System.out.println(over.method(10));// 왜 더블 메소드에서는 출력이 안되지 ? 10도 더블 범위 아닌가 ?
	}
}
