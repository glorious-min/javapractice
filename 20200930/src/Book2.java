
public class Book2 {
	String title;
	int page;
	int price;

	public Book2(String title, int page, int price) {
		this.title = title;
		this.page = page;
		this.price = price;
	}

	public String toString() {
		return "title: " + title + "page: " + page + "price: " + price;
	}
}
