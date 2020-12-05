
public class Member {
	String name;
	int age;
	String address;
	
	public Member(String name, int age,String address) {
		this.name =name;//this를 붙이지 않으면 값이 저장되지 않아서 값이 기본값으로 출력된다 
	    this.age = age;
		this.address = address;
	}
	
	public String toString() {
		return ("이름:"+name+"나이:"+age+"주소:"+address);
	}	
}
