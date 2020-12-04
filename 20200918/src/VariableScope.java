
public class VariableScope {

	
	private int i;
	
	public void firstMethod() {
		int i = 4; // 이건 메소드 블럭안에 위의 아이는 클래스 블록안에 있으므로 이름 중복 가능 
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
