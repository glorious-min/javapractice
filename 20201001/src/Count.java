
public class Count {
	public int serialNumber;
	public static int counter =0;
	
	public Count() {
		counter++;
		serialNumber = counter;
	}
}
