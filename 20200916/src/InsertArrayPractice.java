

public class InsertArrayPractice {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 6, 2, 8, 1 };
		int i;
		int j;
		for (i = 1; i < arr.length; i++) { //ù �ݺ����� ���� ! 
			//�ε��� 0 ���� ���ϴ°��� �ƴ϶� �ε��� 1���� ���ϴ� ���̴ϱ�  �ʱⰪ 1���� �����ؾ��Ѵ� 
			for (j = i ; j >= 1; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j-1 ];
					arr[j-1] = temp;
				}
			}
		}
          for(j=0;j<arr.length ; j++) {
        	  System.out.println(arr[j]);
          }
	}

}
