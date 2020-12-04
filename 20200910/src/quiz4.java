import java.util.Random;

public class quiz4 {

	public static void main(String[] args) {
		int arr [] = {10,20,30,40,50};
		Random ran = new Random();
		int num = ran.nextInt(5);
		System.out.println(arr[num]);
	}

	
}
