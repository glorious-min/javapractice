import java.util.Random;

public class ArrayRandomQuiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr [] = {10,20,30,40,50};
       Random ran = new Random();
       int num = ran.nextInt(5);
       System.out.println(ran.nextInt(arr[num]));
	}

}
