
public class StaticBlock2 {
	
	private static int i;
	
	static {
		i = 100;
	}
	
	public static void main(String[] args) {
		System.out.println("i :"+StaticBlock2.i);

	}

}
