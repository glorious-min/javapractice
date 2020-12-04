
public class AccessModifierTest {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier(); 
		am.age =30 ; //age 변수에 대해서 직접 접근이 불가능 
		//이게 엑세스 모디바이어 클래스의 age 변수라는걸 어떻게 알지 ??
		//엑세스 모디파이어 클래스의 객체라는것을 5번쨰 줄에서 선언 
		//이 클래스에서는 따로 변수 선언을 하지 않았기 때문에 여기에서의 age 가 엑세스 모디파이어 클래스의 변수로 쳐지는듯 
		//만약에 동일한 이름으로 변수를 설정한다면 어떻게 될까 ??
		int geAge = am.getAge();//getAge()메소드는 어디에서든 접근 가능 

	}

}
