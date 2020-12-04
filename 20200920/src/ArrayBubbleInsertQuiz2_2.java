
public class ArrayBubbleInsertQuiz2_2 {

	public static void main(String[] args) {
		// 아래의 그림은 삽입정렬의 순서를 설명한 그림이다. 아래의 그림처럼 동작되도록 코드를 작성하시오.
		// 삽입정렬은 2번째 숫자부터가 기준이 됩니다.
		// 2번쨰 숫자부터 왼쪽으로 비교하면서 연속적으로 자리를 바꾼다고 생각하면 됩니다.
		int arr[] = { 2,4,5,8,9,1 };//숫자바꾸어봄 
		
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
