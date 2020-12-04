import java.util.Scanner;

public class Array2Quiz4 {

	public static void main(String[] args) {
		// 값 20 , 25 , 30 , 10 , 15 , 5 을 가지고 있는 배열이 있다.
		// 인덱스 번호 2개를 입력 받아서 그 값을 서로 바꾸고 출력하시오.
		int arr[] = { 20, 25, 30, 10, 15, 5 };
		Scanner sc = new Scanner(System.in);
	   
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();
		// 입력받은 값 바꾸고 어떻게 바꾸어야 하지 ?
		for ( int index = 0; index < arr.length; index++) {
			if(index ==index1 ) {
				int temp=index1;
				index1 = index2;
				index2=	temp;
			
				System.out.println(arr[index1]);
			}
		}
		
		//왜 값이 안바뀌고 그대로 나오지 ????
		// 마지막 풀이로는 나옴 ! 왜 ??? 
		// 이프문을 반복문안에 한번 더 쓰면 서로 바꾸었던것이 다시 바꾸어서 나오므로 원래의 값과 동일하다 
		// 출력은 한번 했는데 값은 두개가 나오는 이유 - index1 차례일떄 index2로 바뀐 값이 한번 출력된 이후,
		//index2차례가 되었을떄 이미 이전에 바뀌었던 값 index1 이 한번 한번 더 나오므로 !!
		// 처음 나온값은 index1->index2 로 바뀐값 ,
		//다음에 나온 값은 index2->index1로 바뀐 값으로 나오는것 !! 
	}

}
