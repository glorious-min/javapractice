
public class ArrayRandomQuiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [][] = new int [2][3];
		 int i;
		 int j;
		 for(i = 0 ; i < arr.length ; i++) {
			 for(j=0 ; j < arr[i].length ; j++ ) {
				 //arr [i][j]+=10; �̷��� �ϸ� �� �ȵɱ� ?
				 int sum=0;
				 sum+=10;
				 arr[i][j] = sum;
				 System.out.println(arr[i][j]);
			 }
			 System.out.println();
		 }
		 
		   
		 
		 // ó������ �迭�� ������ �ʱ�ȭ�ϰ� �����ϴ°� �ƴ϶� ���� 10 ���� 60���� �ݺ������� �ְ� �ʹٸ� ��� �ؾ��ұ� ??
		 

	}

}
