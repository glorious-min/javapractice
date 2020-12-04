
public class EerrorTest {

	public static void main(String[] args) {
		try {
			int a = 10,b=5;
			System.out.println("Ω√¿€");
			System.out.println(a/b);
			int ary[] =null;
			ary[0] = 1;
			System.out.println("≥°");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		catch(NullPointerException npe) {
			System.out.println(npe.getMessage());
		}

	}

}
