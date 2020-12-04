import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		String[] sarray= new String[5];
		sarray[0] = "권오훈";
		sarray[1]="김동수";
		sarray[2]="김명수";
		sarray[3]="김진수";
		sarray[4]="김민수";
		
		
		// 난수를 발생시키기 !!
		Random ran = new Random();
		//0-4사이의 램덤 숫자 발생시키기 
		int num = ran.nextInt(5); // 랜덤한 인트형 수가 발생함 //범위지정
		//0부터 괄호안에 입력한 수보다 1작은 수까지 랜덤하게 발생 
		//1-5까지 랜덤한 숫자를 발생시키는 코드 
		//int num = ran.nextInt(5)+1;
		System.out.println(sarray[num]);
	}

}
