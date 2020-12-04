
public class ArrayBubbleInsertQuiz2_1 {

	public static void main(String[] args) {
		// 아래의 그림은 삽입정렬의 순서를 설명한 그림이다. 아래의 그림처럼 동작되도록 코드를 작성하시오.
				//삽입정렬은 2번째 숫자부터가 기준이 됩니다. 
				//2번쨰 숫자부터 왼쪽으로 비교하면서 연속적으로 자리를 바꾼다고 생각하면 됩니다.
		int arr [] = {3,4,6,2,8,1};
		int i;
		int j;
		
		for( i = 0 ; i < arr.length-1 ; i ++ ) {
			for(j=i+1; j >0; j--) {
				if(arr[j]<arr[j-1]) {//또 뭐가 문제지 ???? j+1 로 하면 안된 다 ?  i 가 4일때 j+1 이 6이 되므로 안된다 !
					// 두번째 포문의 j가  비교하는 오른쪽의 배열기준이기 때문에 j+1과 비교하면 안된다 ???00부터
					//그리고 j는 인덱스 까지만 따지면 됨 !! 
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
       for( j = 0 ; j < arr.length ; j++) {
    	   System.out.println(arr[j]);
       }
	}

}
