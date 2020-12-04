
public class FinalRef {
	static final MyDate2 date = new MyDate2();
	
	
	public static void main(String[] args) {
		//참조 변수가 final 선언되었으므로 선언시에만 생성이 가능하다 
		date = new MyDate2();
		
		date.year = 1999; // 프라이빗 메소드에 간접적으로 접근한것과 비슷한 건가 ???
		System.out.println(date.year);

	}

}
