
public class Book {
	String title ; 
	int page ;
	int price;
	//멤버변수 여기에 적어서 생성된것이 아니고 !! 객체에서 생성됨 
	//Book book = new Book(); 이떄 만들어짐 , 이 메소드 끝나기 전까지 사용가능 
	
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
