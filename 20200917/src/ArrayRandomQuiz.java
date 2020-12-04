
public class ArrayRandomQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이차원 배열 문제 
		
		int [][] arr = new int [3][5];
		//2차원 배열의 선언과 생성 
		
		int initVal = 0 ; 
		for(int i =0; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				arr[i][j] = initVal ++ ; // 0 이 초기값, 대입을 하고 증가 시키므로 처음에 들어가는 값은 0 이다  
			}
		}
		
		
		// 2차 배열을 순회하면서 값을 출력  
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr[i].length ; j++) {
				System.out.println("["+i+"]["+j+"]:" +
						arr[i][j]);
				System.out.println("\t");
			}
			System.out.println();
		
		}

	}

}
