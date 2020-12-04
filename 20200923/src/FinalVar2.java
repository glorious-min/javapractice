
public class FinalVar2 {

	final int i =9;
	
	public void go() {
		//final 키워드가 붙은 변수는 선언시에만 초기화가 가능 
		//i =10; //error
		System.out.println(i);
		}
	
	public static void main(String[] args) {
		FinalVar2 fv = new FinalVar2();
		fv.go(); //객체에서 go() 메소드릃 호출 

	}

}
