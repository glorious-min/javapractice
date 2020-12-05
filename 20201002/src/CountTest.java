
public class CountTest {

	public static void main(String[] args) {
		System.out.println(Count.counter);
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		System.out.println(c1.serialNumber);
		System.out.println(c2.serialNumber);
		System.out.println(c3.serialNumber);
		
		System.out.println(c1.counter);//c1이라는 객체이지만 카운터 변수는 클래스변수 이기떄문에 이전의 변한 값을 공유한다 \
		//따라서 c3객체가 만들어질때 변한 값 3을 그대로 가지고 있는 상태 
		System.out.println(c2.counter);
	}

}
