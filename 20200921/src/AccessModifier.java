
public class AccessModifier {
    private int age = 30;//사용가능 범위 = 이 클래스 안에서만 가능 
    
    public int getAge() {
    	
    	return age;
    	//에이지값 확인은 가능하도록 메소드로 기능을 제공한것 
    }
	
	public void setScore(int score) {
		this.setScore = score;
	}

}
