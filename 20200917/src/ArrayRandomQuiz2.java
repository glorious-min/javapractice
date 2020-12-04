
public class ArrayRandomQuiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [][] = new int [2][3];
		 int i;
		 int j;
		 for(i = 0 ; i < arr.length ; i++) {
			 for(j=0 ; j < arr[i].length ; j++ ) {
				 //arr [i][j]+=10; 이렇게 하면 왜 안될까 ?
				 int sum=0;
				 sum+=10;
				 arr[i][j] = sum;
				 System.out.println(arr[i][j]);
			 }
			 System.out.println();
		 }
		 
		   
		 
		 // 처음부터 배열의 값들을 초기화하고 시작하는게 아니라 내가 10 부터 60까지 반복문으로 주고 싶다면 어떻게 해야할까 ??
		 

	}

}
