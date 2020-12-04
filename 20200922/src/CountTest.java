
public class CountTest {

	public static void main(String[] args) {
		Count c1 = new Count(); // 카운트 클래스 생성자 실행됨 객체 만들기도전에 0 값 가지고 있었음 
		// c1이 만들어지면서 카운터가 0에서 1로 증가함 그리고 이를 씨리얼넘버에 넣기 
		Count c2 = new Count(); // c2 실행시 카운터값 다시 1증가 이는 클래스의 영향을 받으니 2로 증가함 
		//c2의 시리얼넘버는 2가됨 
		Count c3 = new Count();
		//c3의 시리얼 넘버 3이됨 
		//시리얼넘버 = 멤버변수 = 각객체의 영향  받음 
		System.out.println("c1.serialNumber :" + c1.serialNumber);
        System.out.println("c2.serialNumber :" + c2.serialNumber);
        System.out.println("c3.serialNumber :" + c3.serialNumber);
		
		System.out.println("Count.counter:"+Count.counter);
		System.out.println("c2.counter:" + c2.counter);
	}

}
