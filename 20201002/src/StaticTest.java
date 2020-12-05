
public class StaticTest {
	
	int i =10;
	
	public void go() {
		int i =1;
		System.out.println(this.i);
		System.out.println(i);
	}
	
	public static int goStatic() {
		//this.i = 110;
		int j =2;
		System.out.println(j);
		return j;
	}
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.go();
		
		

	}

}
