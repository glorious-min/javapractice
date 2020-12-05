
public class MyClass {
	String name;
	int age;
	boolean isMale;
	
	public MyClass() {	
	}
	
	public MyClass(String name) {
		this.name =name;
	}
	public MyClass(String name, int age) {
		this.name = name;
		this.age =age;
	}
	public MyClass(String name, int age, boolean isMale) {
		this.name = name;
		this.age= age;
		this.isMale = isMale;
	}//생성자 오버로딩 : 명칭은 동일하되 파라미터는 다르다 
}
