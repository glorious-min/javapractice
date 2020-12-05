
public class Array2Quiz5 {

	public static void main(String[] args) {
		//정수 값 5,3,6,7,2,4,8 을 가지고 있는 배열이 있다. 최대값과 최소값을 구해서 출력하시오.
		int arr [] = {5,3,6,7,2,4,8};
		int i = 0 ;
		int max =arr[i];
		int min =arr[i];
		for( i = 0; i< arr.length-1 ; i++) {
			if(arr[i]<arr[i+1]) {
				max = arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=max;	
			}
		}
		System.out.println(max);
		for( i =0 ;i <arr.length-1 ; i ++) {
			 if(arr[i]>arr[i+1]) {
				min = arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=min;
			}
		}
		System.out.println(min);

	}

}
