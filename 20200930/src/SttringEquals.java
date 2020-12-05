
public class SttringEquals {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		if(s1==s2) {
			System.out.println("s1과 s2는 같다");
		} else {
			System.out.println("s1과 s2는 같지 않다 ");
		}
		
		if(s1.contentEquals(s2)) {
			System.out.println("s1과 s2는 같다");
		} else {
			System.out.println("s1과 s2는 같지 않다");
		}
	
	}

}
