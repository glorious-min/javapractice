
public class CountTest {

	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		System.out.println("c1.serialNumber : "+c1.serialNumber);
		System.out.println("c2.serialNumber : "+c2.serialNumber);
		System.out.println("c3.serialNumber : "+c2.serialNumber);
		
		System.out.println("Count.count: "+Count.counter);

	}

}
