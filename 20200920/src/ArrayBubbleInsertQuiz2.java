
public class ArrayBubbleInsertQuiz2 {

	public static void main(String[] args) {
		// 아래의 그림은 삽입정렬의 순서를 설명한 그림이다. 아래의 그림처럼 동작되도록 코드를 작성하시오.
		//삽입정렬은 2번째 숫자부터가 기준이 됩니다. 
		//2번쨰 숫자부터 왼쪽으로 비교하면서 연속적으로 자리를 바꾼다고 생각하면 됩니다.
		int arr [] = {3,4,6,2,8,1};
		int i;
		int j;
		for(i = 0 ; i < arr.length-1 ; i++) { // 왜 렝스를 하나 줄이니까 작동하지 ????
			for(j = i+1 ; j >0 ; j--) { //i가 5일떄 j는 6으로 아무 문제 없지 않나 ??? 문제임 !! j를 인덱스를 가지는 배열의 인덱스는 5까지 일테니까 !!
				//인덱스가 5까지 이다 = 배열의 길이는 6이다 !!
				//두번쨰 포문 시작지점이 어디지 ???
				// i = 6-1-1일떄 이므로 i 가 4일떄, j=5 일떄로 배열의 인덱스가 5이며 6번째 인덱스일떄 !!
			     if(arr[j]<arr[j-1]) {// 왜 틀린거지 ??
			    	 int temp = arr[j-1];
			    	 arr[j-1] =arr[j];
			    	 arr[j] = temp;
			     }
			}
		}
		for(j = 0 ; j <arr.length ; j++) {
			System.out.println(arr[j]);
		}

	}

}
