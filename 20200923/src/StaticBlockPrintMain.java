
public class StaticBlockPrintMain {
        StaticBlockPrint s = new StaticBlockPrint(); // 이렇게 하면 브로록이 먼저  실행 
        // 이떄 클래스가 읽어져서 그 안으 ㅣ스태틱 블록을 읽고 그 다음 문장 실행 
        // 어떤 것을 먼저 실행하느냐에 따라 스태틱 블록이 먼저 실행 . 
        // 왜 안되지 ?
	public static void main(String[] args) {
		System.out.println("메인메소드 실행 "); // 
		System.out.println(StaticBlockPrint.i);//클래스가 로딩된다 

	}

}
