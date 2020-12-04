
public class Member3 {
	String name;
	int age;
	String address;
	
	public Member3(String name, int age, String address) {
		this.name= name;
		this.age= age;
		this.address = address;
	}
	
	public String toString() {
		return "이름:"+name+"나이:"+age+"주소:"+address;
	}
}
