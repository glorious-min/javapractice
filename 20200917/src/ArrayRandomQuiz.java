
public class ArrayRandomQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �迭 ���� 
		
		int [][] arr = new int [3][5];
		//2���� �迭�� ����� ���� 
		
		int initVal = 0 ; 
		for(int i =0; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				arr[i][j] = initVal ++ ; // 0 �� �ʱⰪ, ������ �ϰ� ���� ��Ű�Ƿ� ó���� ���� ���� 0 �̴�  
			}
		}
		
		
		// 2�� �迭�� ��ȸ�ϸ鼭 ���� ���  
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
