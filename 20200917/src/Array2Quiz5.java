
public class Array2Quiz5 {

	public static void main(String[] args) {
		// �迭���� �ִ밪 �ּҰ� ���ϱ� 
		//������ ������� �ʰ� ���ؾ� �ϴµ� ! 
		//��� ���� �������� ���� ������ �� ��� ?
		//��Ǭ����//���ؾȰ� 
		int arr []  = {5,3,6,7,2,4,8};
		
		int max = arr[0];
		int min = arr[0];
		
		
		for(int index=1; index < arr.length ; index ++ ) {
			if(max<arr[index]) {
				max = arr[index];
			}
			if(min>arr[index]) {
				min = arr[index];
			}
		}

		  System.out.println(max);
		  System.out.println(min);
	}

}
