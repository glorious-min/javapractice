
public class Book1 {
	String title;
	int page;
	int price;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void bookInfo() {
		System.out.println("title: "+title+" page: "+page+" price "+price);
	}
}
