
public class Book {
	String title;
	int page;
	int price;


public String getTitle() {
	return title;
}

public void setTitle(String bookTitle) {
	title = bookTitle;
}
public int getPage() {
	return page;
}

public void setPage(int bookPage) {
	page = bookPage;
}

public int getPrice() {
	return price;
}

public void setPrice(int bookPrice) {
	price = bookPrice;
}

public void printBookInfo() {
	System.out.println("Title: "+title+" Page: "+page+" Price: "+price);
}
}