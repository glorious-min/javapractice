
public class Book {
	String title ; 
	int page ;
	int price;
	//������� ���⿡ ��� �����Ȱ��� �ƴϰ� !! ��ü���� ������ 
	//Book book = new Book(); �̋� ������� , �� �޼ҵ� ������ ������ ��밡�� 
	
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
    	System.out.println(title + " "+ page+ " "+price);
    }
}
