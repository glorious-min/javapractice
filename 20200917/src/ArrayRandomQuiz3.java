import java.util.Random;

public class ArrayRandomQuiz3 {

	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println(ran.nextInt(10)+1);
        // 출력부분에 1을 추가한 이유 = 랜덤은 수가 0 부터 시작하고 10을 입력했을때는 0 부터 9까지의 값이 나오기 떄문에 
		//1을 더해주어서 출력한다 
	}

}
