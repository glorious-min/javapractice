
public class MyClassTest {

	public static void main(String[] args) {
		MyClass mc = new MyClass(20);
		//마이클래스의 객체를 생성하면서 생성자에 20을 전달한다 
		//마이 클래스와 똑같이 생긴 객체를 생성하면서 동시에 생성된 메소드에 20이 들어간다 
		//입력된 newAge가 20이므로 age에 20이 저장된다 
		System.out.println();
		System.out.println("age is: "+mc.age);
	}
	

}
