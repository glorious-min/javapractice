import java.util.Scanner;

public class Array2Quiz6 {

	public static void main(String[] args) {
		//정수 5개를 입력받을 수 있는 배열을 생성 해서 각각의 요소에 값을 입력받고, 총합, 평균을 구하는 코드를 작성하시오.
		int arr [] = new int [5];
		Scanner sc = new Scanner (System.in);
		int index;
		int sum=0;
		int ave=0;
		for(index = 0 ; index < arr.length ; index ++) {
			arr[index] = sc.nextInt();
			sum += arr[index];
			
		}
        
		ave = sum/arr.length;
		System.out.println(sum);
		System.out.println(ave);
	}

}
