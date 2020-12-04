import java.util.Scanner;

public class Array2Quiz4_1 {

	public static void main(String[] args) {
		// 값 20 , 25 , 30 , 10 , 15 , 5 을 가지고 있는 배열이 있다.
	    // 인덱스 번호 2개를 입력 받아서 그 값을 서로 바꾸고 출력하시오.
		
		int arr [] = {20,25,30,10,15,5};
		Scanner sc = new Scanner(System.in);
	    int index1 = sc.nextInt();
	    int index2 = sc.nextInt();
	    
	    int temp = index1;
	    index1 = index2;
	    index2 = temp;
	    
	    System.out.println(arr[index1]);
	    System.out.println(arr[index2]);
        // 이미 배열은 초기화가 되었기 때문에 포문 돌릴필요 없이 인덱스만 바꾸어 주면 된다 !!
	}

}
