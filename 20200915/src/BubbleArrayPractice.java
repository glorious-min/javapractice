
public class BubbleArrayPractice {

	
	public static void main(String[] args) {
		int arr [] = {5,3,8,1};
		int j;
		int i;
		for(i = 0; i < arr.length; i++) {
	        for( j = 0 ; j < arr.length - i - 1 ; j++) {
	            if(arr[j] > arr[j+1]) {
	                int temp = arr[j+1];
	                arr[j+1] = arr[j];
	                arr[j] = temp;
	            }
	        }
	}
		for(i=0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}

}
