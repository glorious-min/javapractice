
public class InsertArrayPractice2 {

	public static void main(String[] args) {
		int arr [] = {3,4,6,2,8,1};
		int i;
		int j;
		for(i = 1 ; i < arr.length ; i++) {
			for(j=i;j>0;j--) {// ������ ���̽����� i=5 , j = 5 �� 
           //arr[5](�ε����� 0���� �����ϹǷ� �ε���5�� ���� ����������)arr[4]
				//�� �� ���� �ڿ��� �ι��� ���� ���ϴ°� ! 
				
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			for(j=0 ;j < arr.length ; j++) {
				System.out.print(arr[j]);	}
			System.out.println();
		
		}

	}

}
