
public class CountTest2 {

	public static void main(String[] args) {
		System.out.println(Count.counter);
		Count2 c = new Count2();
		Count2 c2 = new Count2();
		Count2 c3 = new Count2();
		
		System.out.println(c.serialNumber);
		System.out.println(c2.serialNumber);
		System.out.println(c3.serialNumber);
		System.out.println(c.counter);
		System.out.println(c2.counter);
		System.out.println(c3.counter);

	}

}
