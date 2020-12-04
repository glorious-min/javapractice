

public class InsertArrayPractice {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 6, 2, 8, 1 };
		int i;
		int j;
		for (i = 1; i < arr.length; i++) { //첫 반복문이 기준 ! 
			//인덱스 0 부터 비교하는것이 아니라 인덱스 1부터 비교하는 것이니까  초기값 1부터 시작해야한다 
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
