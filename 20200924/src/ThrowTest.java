

public class ThrowTest {

	public static void main(String[] args) {
		try {
			summary();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int divide (int n, int m) throws Exception{
		return n/m;
	}
	
	public static void summary() throws Exception {
		try {
			System.out.println("계산결과"+divide(10,0));
		} catch(Exception e) {
			throw new Exception ("계산오류");
			
		}
	}
}
