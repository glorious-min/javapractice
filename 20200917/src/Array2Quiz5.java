
public class Array2Quiz5 {

	public static void main(String[] args) {
		// 배열에서 최대값 최소값 구하기 
		//정렬을 사용하지 않고 구해야 하는듯 ! 
		//계속 이프 구문으로 비교해 나가야 함 어떻게 ?
		//못푼문제//이해안감 
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
