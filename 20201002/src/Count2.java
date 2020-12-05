
public class Count2 {
	int serialNumber; // 클래스 변수가 아님 // 
	static int counter=0; // 클래스 변수임 
	
	public Count2() {
		counter++;
		serialNumber= counter;
	}
	
}
