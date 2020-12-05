
public class BookMain1 {

	public static void main(String[] args) {
		Book1 book1 = new Book1();
		book1.setTitle("이경민 자서전");
		book1.setPage(200);
		book1.setPrice(30000);
		book1.bookInfo();
		
		Book1 book2 = new Book1();
		book2.setTitle("코딩 비법 ");
		book2.setPage(350);
		book2.setPrice(27000);
		book2.bookInfo();
	}

}
