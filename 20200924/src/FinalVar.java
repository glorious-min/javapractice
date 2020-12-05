
public class FinalVar {
	final int i = 9 ;
	
	
	public void go() {
		// final 키워드가 붙은 변수는 선언시에만 초기화가 가능하다 
		//i = 10;
		System.out.println(i);
	}
	
	//public static void main(String[] args) {
		//FinalVar fv = new FinalVar();
		//fv.go();
	//}// 메인메소드가 있는 다른 클래스에서 실행을 해주지 않아서 메인메소드가 없는 이 클래스는 실행되지 않는다 
}
