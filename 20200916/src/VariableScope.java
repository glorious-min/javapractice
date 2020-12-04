
public class VariableScope { // 퍼블릭 - 가장 넓은 접근 지정자. 다른 클래스에서도 사용가능 ( 아래변수가 퍼블릭이라면)

	private int i; // 이 변수는 이 클래스 안에서만 사용 가능 (프라이빗이여서) 아니라면 다른 클래스에서 사용가능
    //멤버변수 
	public void firstMethod() {
		//리턴안함 , 메소드명 괄호에 아무것도 없음- 전달해야하는 값없음 
		int i = 4; //이 아이는 지역변수 위의 아이는 멤버변수여서 이름 같아도 쓸수 있음 
		//같은 범위 같은 이름은 불가능 
		int j = 5;
		this.i = i + j; // 아이 더하기 제이의 값을 멤버변수 아이에 넣어라 
		System.out.println("first i =" + this.i);
		secondMethod(7);// 아래 메소드에 값 전달 
		System.out.println("끝");
		//우리가배운것 = 객체가 있어야 메소드 실행가능 , 이 부분은 객체가 없는데고 실행함
		//객체가 없더라도 같은 클래스에서 실행해서 가능한것 
		//출력후 첫 메소드가 종료되지 않고 두번째 메소드로 7을 가지고 넘어간것.
		
	}

	public void secondMethod(int i) {
		int j = 8;
		this.i = i + j;// 위의 제이와 상관없는 제이. 7+8을 멤버변수 아이로 전달 
		System.out.println("second i=" + this.i);
	}//메소드가  끝나고 
	//다시  위로 올라가 sysout '끝'으로 돌아가 아까 못끝낸것을 마저 끝낸다 
	

	public static void main(String[] args) {// 메소드를 만들었음
		VariableScope scope = new VariableScope();
		scope.firstMethod();
        //메인문 없으면 출력안된다 
		//클래스가 있다고 샐행되는 것은 아니다 .
	}

}
