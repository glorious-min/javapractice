
public class StaticBlockPrint {
	public static int i;
	// 이 둘다 초기화 인가 ?
	// 위의 초기화된 자원은 계속 공유되고 값을 다른곳에서 바꿀수 있음 계속 사용가능 
	//멤버변수 선언후 스태틱 블록이 실행된다 
	
	static {
		System.out.println("첫번쨰 스태틱 블럭 ");
		i =10; // 초기값을 스태틱 불록 안에 넣으면 이게 가장 먼저 실행되므로 다른 값을 가질수 없다 
	}
	
	static {
		System.out.println("두번쨰 스태틱 블럭");// 차례대로 실행됨 
		i=20;
	}

}
