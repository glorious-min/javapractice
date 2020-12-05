
public  class StaticTest2 {
	
	int i = 10;
	
	public static  int go() {
		int i = 1;
		//System.out.println(this.i);
		System.out.println(i);
		return i;
	}
	
	public static int goStatic() {
		int j =2;
		int m =3;
		
		System.out.println(j);
		System.out.println(m);
		return j;
		return m; //(unreachable code) 메소드당 리턴은 하나씩만 가능함 , 
		// return은 메소드를 종료하는 기능이 우선이기 떄문에 종료후 밑의 코드를 실행 불가능하다 
		// 내코드는 1232까지 출력하고 끝난것 ?? 
	}
	
	public static void main (String[] args) {
		StaticTest2 st = new StaticTest2();
		st.go();
		
		//main메소드에서 바로 접근 가능 
		System.out.println(goStatic());
		
		//main 메소드에서 바로 접근 불가능 
		System.out.println(go());
		
		//static에서 this사용 불가능 
		//System.out.println(this.i);
		
	}
}

