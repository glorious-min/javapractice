
public class LocalVariablePractice {

	public static void main(String[] args) {
		int i = 0 ; // 메소드안에 있으므로 지역변수
		//지역변수는 내가 초기화를 해주어야한다 
		
		for(; i < 10 ; i++) {
			System.out.println(i);
		}
        System.out.println("반복문이 끝난후"+i);
        //반복문안에서 i 가 9까지 증가한 이후에 다시 포문의 조건부로 돌아가서 10보다 작으니 한번 증가되고 출력됨 
        //변수가 어디부터 어디ㅏㄲ지 살아있는지 잘 알아야함 !! 잘모르겠므 
	}

}
