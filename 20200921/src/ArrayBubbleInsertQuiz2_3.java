
public class ArrayBubbleInsertQuiz2_3 {

	public static void main(String[] args) {
		// �Ʒ��� �׸��� ���������� ������ ������ �׸��̴�. �Ʒ��� �׸�ó�� ���۵ǵ��� �ڵ带 �ۼ��Ͻÿ�.
		// ���������� 2��° ���ں��Ͱ� ������ �˴ϴ�.
		// 2���� ���ں��� �������� ���ϸ鼭 ���������� �ڸ��� �ٲ۴ٰ� �����ϸ� �˴ϴ�.
		// �������� Ǭ ��� = �� �����ϴ� !! 
		int arr[] = { 3, 4, 6, 2, 8, 1 };
		int i;
		int j;
		
		for(i = 1 ; i < arr.length ; i ++) {
			for(j= i; j >0; j --) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
 				}
			}
		}
          for(j = 0 ; j < arr.length ; j++) {
        	  System.out.println(arr[j]);
          }
	}

}
