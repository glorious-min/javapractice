
public class Count2 {
	public int serialNumber; // 멤버변수
	public static int counter = 0 ; //클래스 변수 
	
	public Count2() {
		counter++;
		serialNumber = counter;
	}
}
