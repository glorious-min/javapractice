 import java.util.Scanner;

public class B3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int [10];
		int count [] = new int [42];
		
		
		for(int i = 0 ; i < 10 ; i++) {
			arr[i]=sc.nextInt();
			count[arr[i]%42]++; // arr[i]%42를 인덱스를 가지고 있는 count 배열들의 값을 반복문이 돌때마다 증가 시킴 
			//count 배열은 인트형 배열이기 떄문에 초기값은 모두 0을 가지고 있는 상태 
			//따라서  배열이 모두 돈 후 arr[i]%42를 인덱스를 가지고 있는 배열들만 0 이 아닌 값을 가지게된다 
		}
		int total=0;
	    for(int j = 0 ; j < count.length ; j++) {
	    	if (count[j]!=0) {
	    		total++;
	    	}
	    }
		System.out.println(total);
	}

}
