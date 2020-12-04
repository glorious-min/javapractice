
public class BookMain {

	
	public static void main(String[] args) {
		// 실행하기위해 메인 메소드 필요 
		//프로그램의 실행 시작 위치 
		Book book = new Book();
		//Book 클래스를 사용하고  싶다면 book 클래스의 객체를 생성해야 
        //컨트롤 쉬프트로 자동 ㅅ ㅐㅇ성 
		// 기능 = 메소드 , 메소드 실행할떄 메소드 이름 ㅣ이용해서 실행 
		book.setTitle("그림으로 쉽게 배우는 자바 ");//괄호안이 실행 위치 
		//문자열인 채ㄱ제목을 public void setTitle(String bookTitle) {로 전달함 (질문) - 에서 전달받은거야 아니면 전달하는거야?
		//객체를 통해 셋타이틀이라는 메소드를 호출한것 
		String title = book.getTitle(); // 전달하는 값없음 
		//리턴받은 괎이 왼쪽으로 전달이됨 
		//System.out.println(title);// 파라미터의값이 실행되어야함 
		//Book 개체에 제목을 저장했고 이를 다시 꺼내서 출력한것 
		//리턴되는 값이 여기  book.getTitle() 로 오는것 
		//이것이 스트링이기 떄문에 형태를 맞추어서 왼쪽이 String title로 표시 
		book.printBookInfo();//Book 클래스으 ㅣ마지막 코드 !
		// 페이지 프라이스는 값입력 안했기떄문에 인트형 기본인 0이 출력됨 
		Book book2 = new Book();
		//같은 클래스로 만들었어도 다른 객체임 book 이라는 객체와 다른것 
		//하지만 book과 동일하게 타이틀 페이지 프라이스를 지님 
		
		book2.setTitle("정처기 2020");
		book2.printBookInfo();
	}

}
