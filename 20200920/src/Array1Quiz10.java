
public class Array1Quiz10 {

	public static void main(String[] args) {
		//11, 12, 13, 14, 25, 30, 54, 65, 68 ,77 �� ���� ���� int�� �迭�� �����ϰ�
		//���� ũ���� �ٸ� �迭�� �� ������ �����ϴ� �ڵ带 �ۼ� �Ͻÿ�.

		int arr [] = {11,12,13,14,25,30,54,65,68,77};
		int arr2 [] = new int[10];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr2[i]=arr[i];
			//System.out.println(arr2[j]);
		}
		System.out.println(arr2[7]);
		//arr2�� ���� ����� �ȵ��� !! arr2�� �ε����� �ϳ��� �ø��鼭 �������־���Ѵ� 
	    // ��� ���� ??? 
		// �� �迭�� ������ �ϳ��� �����ϸ� �ȴ� !!
	}

}
