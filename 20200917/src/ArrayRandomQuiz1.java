import java.lang.reflect.Array;

public class ArrayRandomQuiz1 {

	public static void main(String[] args) {
		int [][] arr =  {{1},{1,2},{1,2,3},{1,2,3,4}};
		
		for (int i = 0 ; i  < arr.length; i ++) {
			System.out.println((i+1) + " 번쨰 줄을 출력합니다");
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + "");
			}
			System.out.println("");
		}

	}

}
