
public class AccessModifierTest {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		am.age = 30;// 퍼블릭이라면 변수에 직접 접근 가능 
		// 프라이빗이면 허용범위를 막아놓아 불가능 에이지 값 바꿀수 없다 
		int getAge = am.getAge(); //변수에 직접 접근 못하도록 간접 접근
		//모디파이어 클래스의 메소드 열어둔것 

	}

}
