
public class ArrayBubbleInsertQuiz2_2 {

	public static void main(String[] args) {
		// �Ʒ��� �׸��� ���������� ������ ������ �׸��̴�. �Ʒ��� �׸�ó�� ���۵ǵ��� �ڵ带 �ۼ��Ͻÿ�.
		// ���������� 2��° ���ں��Ͱ� ������ �˴ϴ�.
		// 2���� ���ں��� �������� ���ϸ鼭 ���������� �ڸ��� �ٲ۴ٰ� �����ϸ� �˴ϴ�.
		int arr[] = { 2,4,5,8,9,1 };//���ڹٲپ 
		
	    int i;
	    int j;
	    for(i = 0 ; i<arr.length-1 ; i++) {
	    	for(j = i+1 ; j > 0 ; j -- ) {
	    		if(arr[j]<arr[j-1]) {
	    			int temp = arr[j];
	    			arr[j] = arr[j-1];
	    			arr[j-1] = temp;
	    		}
	    	}
	    }
       for(j = 0 ; j <arr.length ; j++) {
    	   System.out.println(arr[j]);
       }
	}

}
