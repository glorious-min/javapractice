
public class FinalVar {
	final int i = 9; // 이 i가 final 붙어서 상수가 됨 9로 초기화되어 바뀌지않는다
	
	public static final String GENDERCODE = "M01";
	//스태틱 공유 파이널 변하지 않는 문자열 누구나쓸수 있고 같이 쓸수 ㅇ 변하지 않는 문자열
	//대문자 - 스태틱 파이널 붙으면 대문자로 적는다 . 상수의 표현 
	//절대변하지 않는데 계속사용해야하는 경우 이렇게 만듦 
	//FianlVar.GENDRCODE  로하면 변하지 않는 값을 계속 사용 가능 - 
	//성별페이지들이 보여야하는 특정 페이지들에서 코드화해서 사용가능 매번 만드는게 아닌 한번 만들어 공통으로 사용하ㅡㄴ것 
	
	public void go() {
		//fianl 이 붙은 변수는 선언시에만 초기화가 가능하다 
		i=10; // 값을 변경할 수 가 없다 
		System.out.println(i);
	}
	public static void main(String[] args) {
		FinalVar fv = new FinalVar();
		fv.go();

	}

}
