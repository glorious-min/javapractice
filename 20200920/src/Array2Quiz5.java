
public class Array2Quiz5 {

	public static void main(String[] args) {
		//���� �� 5,3,6,7,2,4,8 �� ������ �ִ� �迭�� �ִ�. �ִ밪�� �ּҰ��� ���ؼ� ����Ͻÿ�.
        int arr [] = {5,3,6,7,2,4,8};
        int max = arr[0];
        int min = arr[0];
        
        for(int i = 1; i <arr.length; i++) {
        	if(max < arr[i]) {
        		max = arr[i];
        	}
        	if(min > arr[i]) {
        		min = arr[i];
        	}
        	
        }
        System.out.println(max);
        System.out.println(min);
        
	}

}
