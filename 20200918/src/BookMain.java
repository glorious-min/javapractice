
public class BookMain {

	public static void main(String[] args) { // 클래스 실행하기 위한 메인 메소드 
		Book book = new Book();
		book.setTitle("그림으로 쉽게 배우는 자바 프로그래밍 ");
		//메소드를 호출함 객체를 통해 메소드를 호출한것 
		//클래스의 메소드를 직접 실행한것이 아니라 객체의 메소드 settitle을 실행한것 
       String title =  book.getTitle(); // 오른쪽 식은 클래스의 return title에서 반환된 값 , 
       //클래스 페이지에서 리턴값의 형태를 스트링으로 정했으니까 여기에서 book객체에 대입할떄의 자료형도 스트링임 ! 
       // 클래스의 gettitle이 실행됨 클래스에서 리턴을 스트링으로 한다고 했으므로 이건 스트링이된다. 여기에서 출력을 하던 대입을해보기
       // 이렇게 하면 title이라는 변수에 대입 하면 겟타이틀 실행하고 반환받은 값이 title로 대입이됨 
       System.out.println(title);
       // 요약 - 책의 제목을 book 개체에 저장하고 , book개체에서 다시 빼내서 title 이라는 변수에 저장한 이후 출력한것 
       
       book.printBookInfo();
	}

}
