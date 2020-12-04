
public class arrayquiz2 {

	
	public static void main(String[] args) {
		int arr []= {3,4,6,2,8,1};
		int i;
		int temp;
		for(i=1 ; i < arr.length ;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j-1]<arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}}

}
