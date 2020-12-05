
public class Book1 {
	String title;
	int page;
	int price;
	

	
	public  Book1(String title, int page, int price) {
		this.title=title;
		this.page=page;
		this.price=price;
	}
	public String toString() {
		return "title: "+title+"page: "+page+"price:"+price;
	}
}
