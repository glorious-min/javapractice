
public class MyClass3 {
String name;
int age;
boolean isMale;
//생성자 오버로딩 - 메소드의 이름이 같고 파라미터는 틀리게 /
//마이클래스의 기본 생성자 사용하고 싶어서 만듦 
public MyClass3() {
	
} // 아무것도 없는 기본 생성자 

// 이름입력을 받는 생성자 1 
public MyClass3(String name) {
	this.name =name;
}

//이름 ,나이를 입력받는 생성자 2 
public MyClass3(String name, int age) {
	this.name = name;
	this.age = age;
}

//이름,나이,성별 입력받는 생성자
public MyClass3(String name, int age, boolean isMale) {
	this.name = name;
	this.age = age;
	this.isMale= isMale;
	
// 생성자 오버로딩 - 다양한 기능을 제공할 수 있다 
//
}
}
