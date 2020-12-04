
public class MyClass4Test {

	public static void main(String[] args) {
		// 클래스내에 생성자가 정의 되어 있지 않아도 객체를 생성할 수 있다 
		//이때는 컴파일러에서 기본 생성자를 만들어서 호출 한 후 객체를 생성한다.
		MyClass4 mc = new MyClass4(); 
		// Myclass4 클래스에서 생성자 따로 만들지 않았지만 기본 생성자가 자동으로 만들어져 있음 !
		System.out.println("age is :"+mc.age);
		System.out.println("age is:"+mc.age);
		System.out.println("age is "+mc.isMale);

	}

}
