
public class ArrayBubbleInsertQuiz1 {

	public static void main(String[] args) {
	 int arr [] = {5,3,8,1};
	 int j;
	 for(int i = 0; i < arr.length ; i++) {
		 for(j = 0 ; j < arr.length-1 ; j++) {
			 if(arr[j]>arr[j+1]) {
				 int temp = arr[j];
				 arr[j] = arr[j+1];
				 arr[j+1] = temp ;
			 }
		 }
	 }
	for(j=0; j< arr.length ; j++) {
		System.out.println(arr[j]);
	}

	}

}
