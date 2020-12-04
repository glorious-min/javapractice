
public class StaticTest {
	int i = 10;
	
	public void go() {
		int i= 1;
		System.out.println(this.i);
		System.out.println(i);
		
	}
	
	public static int goStatic() {
		//this.i = 10; 쓸수 없음
		int j = 2;// 지역변수는 참조만 안됨 생성은 됨 
		System.out.println(j);// 출력됨 
		return j; // 고스태틱 메소드 실행한 곳으로 값을 반환함 
	}

	public static void main(String[] args) { // ;메인 메소드도 정적 메소드 
		// 메인메소드에 모두 적용이 될것 
		StaticTest st = new StaticTest(); // 클래스 자신의 객체 만듦 
		st.go();// 스태틱과 별개로 내가 참조해서 만든것이여서 사용 가능 // 객체가 만들어져 있어서 실행 가능 // 
		// 스태틱이 아닌 메소드를 스태틱 메소드 안에서 쓸수 없지만 ,쓸 수 있음 
		//  참조한것이 아니라 참조한 객체를 '실행' 한것이라서 가능  ?참조와 실행은 무슨 차이지 ?
		
		System.out.println(goStatic());
		//System.out.println(go());// 불가능 // 객체가 만들어 지지 않아서 실행 불가능 
	}
}
