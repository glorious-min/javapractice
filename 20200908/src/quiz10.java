//정수 값 10개를 입력 받기 위한 배열을 선언하고 각각의 배열 요소에 정수를 입력 받은 후 출력하는 코드를 작성 하시오.
import java.util.Scanner;

public class quiz10 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr =new int [10];
		Scanner sc = new Scanner(System.in);
		int a=0;
		int index=0;
		
		for (index=0 ; index <10 ;index ++) {
			
			System.out.print((index+1)+"번쨰 데이터 ");
			a=sc.nextInt();
			arr[index]= a;
		}
		for (index=0;index<10;index++) {
			
			System.out.println(arr[index]);
		}//메인 메소드를 두개의 포문 밖에서 정의했기 떄문에
		//두번째 포문도 첫번쨰 포문에서 초기화한 배열의 값들이 적용이 된다 
		//맨위에서 정의한 메인 메소드를 모두가 공유하기 때문임 .
	}

}
