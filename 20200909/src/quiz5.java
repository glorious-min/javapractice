
public class quiz5 {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 6, 7, 2, 4, 8 };
		int min = arr[0];
		int max = arr[0];
		
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max) {
				max = arr[index];
			}
		
			if (arr[index] < min) {
				min = arr[index];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	

}
