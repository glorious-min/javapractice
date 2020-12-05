
public class Count {

	public int serialNumber; // 멤버변수 1이됨 
	public static int counter = 0 ; 
	
	public Count() { // 파라미터 없어서 전달 값없지만 해야하는 기능은 있음 
		counter++;
		serialNumber = counter; // count를 증가시킨후 대입 

	}

}
