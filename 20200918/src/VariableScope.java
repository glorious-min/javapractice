
public class VariableScope {

	
	private int i;
	
	public void firstMethod() {
		int i = 4; // �̰� �޼ҵ� ���ȿ� ���� ���̴� Ŭ���� ��Ͼȿ� �����Ƿ� �̸� �ߺ� ���� 
		int j = 5;
		this.i = i + j ; 
		System.out.println("first i="+this.i);
		secondMethod(7);
	}
	
	public void secondMethod(int i) {
		int j = 8;
		this.i = i+j;
		System.out.println("second i = " + this.i);
	}
	
	public static void main(String[] args) {
		VariableScope scope = new VariableScope();
		scope.firstMethod();
		

	}

}
