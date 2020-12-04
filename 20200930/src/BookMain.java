
public class BookMain {

	public static void main(String[] args) {
		Book book1= new Book();
		
		book1.setTitle("그림으로 쉽게 배우는 자바 ");
		book1.setPage(200);
		book1.setPrice(18000);
		//이 정보는 클래스의 멤버변수가 아니라 객체의 멤버변수에 저장이 되는것 ?o
		String title = book1.getTitle();//메소드에서 정보가져옴
		//그리고 어디에 쓰는것 ??
		//책 정보를 출력하는데 관련이 없는 상관 없음
		//필요없는 코드 . 그냥 겟타이틀메소드를 실행시켜리턴값을 받는다는것을 의미함 
		book1.printBookInfo();//이게 있어야 정보가 출력됨 
		//출력하는 메소드이기 떄문에 이게 있어야 책 정보가 출력됨 
		
		Book book2 = new Book();
		book2.setTitle("정처기 2020");
		book2.setPage(570);
		book2.setPrice(23000);
		book2.printBookInfo();
		
		

	}

}
