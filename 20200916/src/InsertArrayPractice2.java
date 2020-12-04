
public class InsertArrayPractice2 {

	public static void main(String[] args) {
		int arr [] = {3,4,6,2,8,1};
		int i;
		int j;
		for(i = 1 ; i < arr.length ; i++) {
			for(j=i;j>0;j--) {// 마지막 페이스에는 i=5 , j = 5 로 
           //arr[5](인덱스가 0부터 시작하므로 인덱스5가 가장 마지막값임)arr[4]
				//맨 끝 값과 뒤에서 두번쨰 값을 비교하는것 ! 
				
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			for(j=0 ;j < arr.length ; j++) {
				System.out.print(arr[j]);	}
			System.out.println();
		
		}

	}

}
